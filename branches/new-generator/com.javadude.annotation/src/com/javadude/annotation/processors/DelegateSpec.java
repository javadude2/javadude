/*******************************************************************************
 * Copyright (c) 2008 Scott Stanchfield.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Scott Stanchfield - initial API and implementation
 *******************************************************************************/
package com.javadude.annotation.processors;

import com.javadude.annotation.Bean;
import com.javadude.annotation.Property;

@Bean(superclass=Type.class,
	  defineCreatePropertyMap=true,
	  properties = {
		@Property(name="accessor")
})
public class DelegateSpec extends DelegateSpecGen implements Pushable {
	// nothing to add
}