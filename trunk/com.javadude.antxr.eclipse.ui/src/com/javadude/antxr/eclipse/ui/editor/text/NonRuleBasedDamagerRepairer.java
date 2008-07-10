/*******************************************************************************
 *  Copyright 2008 Scott Stanchfield.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *******************************************************************************/
package com.javadude.antxr.eclipse.ui.editor.text;

import com.javadude.antxr.eclipse.ui.AntxrUIPlugin;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.presentation.IPresentationDamager;
import org.eclipse.jface.text.presentation.IPresentationRepairer;
import org.eclipse.jface.util.Assert;
import org.eclipse.swt.custom.StyleRange;

/**
 * Damage repairer
 */
public class NonRuleBasedDamagerRepairer implements IPresentationDamager,
													   IPresentationRepairer {
	/** The document this object works on */
	protected IDocument fDocument;

	/** The default text attribute if non is returned as data by the current token */
	protected TextAttribute fDefaultTextAttribute;

	/**
	 * Constructor for NonRuleBasedDamagerRepairer.
	 * @param aDefaultTextAttribute text attribute
	 */
	public NonRuleBasedDamagerRepairer(TextAttribute aDefaultTextAttribute) {
		Assert.isNotNull(aDefaultTextAttribute);

		fDefaultTextAttribute = aDefaultTextAttribute;
	}

	/**
	 * @see IPresentationRepairer#setDocument(IDocument)
	 */
	public void setDocument(IDocument aDocument) {
		fDocument = aDocument;
	}

	/**
	 * Returns the end offset of the line that contains the specified offset or
	 * if the offset is inside a line delimiter, the end offset of the next line.
	 *
	 * @param anOffset the offset whose line end offset must be computed
	 * @return the line end offset for the given offset
	 * @exception BadLocationException if offset is invalid in the current document
	 */
	protected int endOfLineOf(int anOffset) throws BadLocationException {

		IRegion info = fDocument.getLineInformationOfOffset(anOffset);
		if (anOffset <= info.getOffset() + info.getLength()) {
	        return info.getOffset() + info.getLength();
        }

		int line = fDocument.getLineOfOffset(anOffset);
		try {
			info = fDocument.getLineInformation(line + 1);
			return info.getOffset() + info.getLength();
		} catch (BadLocationException x) {
			return fDocument.getLength();
		}
	}

	/**
	 * @see IPresentationDamager#getDamageRegion(ITypedRegion, DocumentEvent, boolean)
	 */
	public IRegion getDamageRegion(ITypedRegion aPartition,
				DocumentEvent anEvent, boolean aDocumentPartitioningChanged) {
		if (!aDocumentPartitioningChanged) {
			try {

				IRegion info = fDocument.getLineInformationOfOffset(
														  anEvent.getOffset());
				int start = Math.max(aPartition.getOffset(), info.getOffset());

				int end = anEvent.getOffset() + (anEvent.getText() == null
												 ? anEvent.getLength()
												 : anEvent.getText().length());
				if (info.getOffset() <= end && end <= (info.getOffset() +
								 						   info.getLength())) {
					// optimize the case of the same line
					end = info.getOffset() + info.getLength();
				} else {
					end = endOfLineOf(end);
				}
				end = Math.min(aPartition.getOffset() + aPartition.getLength(),
								end);
				return new Region(start, end - start);
			} catch (BadLocationException x) {
				AntxrUIPlugin.log(x);
			}
		}
		return aPartition;
	}

	/**
	 * @see IPresentationRepairer#createPresentation(TextPresentation, ITypedRegion)
	 */
	public void createPresentation(TextPresentation aPresentation,
									ITypedRegion aRegion) {
		addRange(aPresentation, aRegion.getOffset(), aRegion.getLength(),
				 fDefaultTextAttribute);
	}

	/**
	 * Adds style information to the given text presentation.
	 *
	 * @param aPresentation the text presentation to be extended
	 * @param anOffset the offset of the range to be styled
	 * @param aLength the length of the range to be styled
	 * @param anAttr the attribute describing the style of the range to be styled
	 */
	protected void addRange(TextPresentation aPresentation, int anOffset,
							 int aLength, TextAttribute anAttr) {
		if (anAttr != null) {
	        aPresentation.addStyleRange(new StyleRange(anOffset, aLength,
													   anAttr.getForeground(),
													   anAttr.getBackground(),
													   anAttr.getStyle()));
        }
	}
}
