// CODE GENERATED BY JAVADUDE BEAN ANNOTATION PROCESSOR
// -- DO NOT EDIT  -  THIS CODE WILL BE REGENERATED! --
package com.javadude.annotation.processors;

@javax.annotation.Generated(
    value = "com.javadude.annotation.processors.BeanAnnotationProcessor",
    date = "Mon Dec 22 21:33:09 EST 2008",
    comments = "CODE GENERATED BY JAVADUDE BEAN ANNOTATION PROCESSOR; DO NOT EDIT! THIS CODE WILL BE REGENERATED!")
public abstract class DataGen  {
    public DataGen() {
        ;
    }

    private java.lang.String packageName_;
    public java.lang.String getPackageName() {
        return packageName_;
    }
    public void setPackageName(java.lang.String value)  {
        packageName_ = value;
    }

    private java.lang.String firstPropertyName_;
    public java.lang.String getFirstPropertyName() {
    	return firstPropertyName_;
    }
    public void setFirstPropertyName(java.lang.String value)  {
    	firstPropertyName_ = value;
    }

    private java.lang.String className_;
    public java.lang.String getClassName() {
        return className_;
    }
    public void setClassName(java.lang.String value)  {
        className_ = value;
    }

    private java.util.Date date_;
    public java.util.Date getDate() {
        return date_;
    }
    public void setDate(java.util.Date value)  {
        date_ = value;
    }

    private java.lang.String classAccess_;
    public java.lang.String getClassAccess() {
        return classAccess_;
    }
    public void setClassAccess(java.lang.String value)  {
        classAccess_ = value;
    }

    private java.lang.String superclass_;
    public java.lang.String getSuperclass() {
        return superclass_;
    }
    public void setSuperclass(java.lang.String value)  {
        superclass_ = value;
    }

    private boolean cloneable_;
    public boolean isCloneable() {
        return cloneable_;
    }
    public void setCloneable(boolean value)  {
        cloneable_ = value;
    }

    private int spacesForLeadingTabs_;
    public int getSpacesForLeadingTabs() {
        return spacesForLeadingTabs_;
    }
    public void setSpacesForLeadingTabs(int value)  {
        spacesForLeadingTabs_ = value;
    }

    private boolean atLeastOneBound_;
    public boolean isAtLeastOneBound() {
        return atLeastOneBound_;
    }
    public void setAtLeastOneBound(boolean value)  {
        atLeastOneBound_ = value;
    }

    private boolean atLeastOneObject_;
    public boolean isAtLeastOneObject() {
    	return atLeastOneObject_;
    }
    public void setAtLeastOneObject(boolean value)  {
    	atLeastOneObject_ = value;
    }

    private boolean atLeastOneDouble_;
    public boolean isAtLeastOneDouble() {
    	return atLeastOneDouble_;
    }
    public void setAtLeastOneDouble(boolean value)  {
    	atLeastOneDouble_ = value;
    }

    private boolean definePropertyNameConstants_;
    public boolean isDefinePropertyNameConstants() {
        return definePropertyNameConstants_;
    }
    public void setDefinePropertyNameConstants(boolean value)  {
        definePropertyNameConstants_ = value;
    }

    private boolean extendPropertyNameConstants_;
    public boolean isExtendPropertyNameConstants() {
        return extendPropertyNameConstants_;
    }
    public void setExtendPropertyNameConstants(boolean value)  {
        extendPropertyNameConstants_ = value;
    }

    private boolean equalsShouldCheckSuperEquals_;
    public boolean isEqualsShouldCheckSuperEquals() {
        return equalsShouldCheckSuperEquals_;
    }
    public void setEqualsShouldCheckSuperEquals(boolean value)  {
        equalsShouldCheckSuperEquals_ = value;
    }

    private java.lang.String superConstructorSuperCall_;
    public java.lang.String getSuperConstructorSuperCall() {
        return superConstructorSuperCall_;
    }
    public void setSuperConstructorSuperCall(java.lang.String value)  {
        superConstructorSuperCall_ = value;
    }

    private java.lang.String superConstructorArgs_;
    public java.lang.String getSuperConstructorArgs() {
        return superConstructorArgs_;
    }
    public void setSuperConstructorArgs(java.lang.String value)  {
        superConstructorArgs_ = value;
    }

    private int year_;
    public int getYear() {
        return year_;
    }
    public void setYear(int value)  {
        year_ = value;
    }

    private boolean defineSimpleEqualsAndHashCode_;
    public boolean isDefineSimpleEqualsAndHashCode() {
        return defineSimpleEqualsAndHashCode_;
    }
    public void setDefineSimpleEqualsAndHashCode(boolean value)  {
        defineSimpleEqualsAndHashCode_ = value;
    }

    private boolean createPropertyMap_;
    public boolean isCreatePropertyMap() {
        return createPropertyMap_;
    }
    public void setCreatePropertyMap(boolean value)  {
        createPropertyMap_ = value;
    }

    private boolean createPropertyMapCallsSuper_;
    public boolean isCreatePropertyMapCallsSuper() {
        return createPropertyMapCallsSuper_;
    }
    public void setCreatePropertyMapCallsSuper(boolean value)  {
        createPropertyMapCallsSuper_ = value;
    }

    private final java.util.List<com.javadude.annotation.processors.PropertySpec> properties_ = new java.util.ArrayList<com.javadude.annotation.processors.PropertySpec>();
    public com.javadude.annotation.processors.PropertySpec getProperty(int i) {
        return properties_.get(i);
    }
    public java.util.List<com.javadude.annotation.processors.PropertySpec> getProperties() {
        return properties_;
    }
    public boolean propertiesContains(com.javadude.annotation.processors.PropertySpec value) {
        return properties_.contains(value);
    }
    public void addProperty(com.javadude.annotation.processors.PropertySpec value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to property");
        properties_.add(value);
    }
    public void addProperty(int i, com.javadude.annotation.processors.PropertySpec value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to property");
        properties_.add(i, value);
    }
    public void clearProperties() {
        properties_.clear();
    }

    private final java.util.List<com.javadude.annotation.processors.Type> observers_ = new java.util.ArrayList<com.javadude.annotation.processors.Type>();
    public com.javadude.annotation.processors.Type getObserver(int i) {
        return observers_.get(i);
    }
    public java.util.List<com.javadude.annotation.processors.Type> getObservers() {
        return observers_;
    }
    public boolean observersContains(com.javadude.annotation.processors.Type value) {
        return observers_.contains(value);
    }
    public void addObserver(com.javadude.annotation.processors.Type value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to observer");
        observers_.add(value);
    }
    public void addObserver(int i, com.javadude.annotation.processors.Type value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to observer");
        observers_.add(i, value);
    }
    public void clearObservers() {
        observers_.clear();
    }

    private final java.util.List<com.javadude.annotation.processors.Method> defaultMethods_ = new java.util.ArrayList<com.javadude.annotation.processors.Method>();
    public com.javadude.annotation.processors.Method getDefaultMethod(int i) {
        return defaultMethods_.get(i);
    }
    public java.util.List<com.javadude.annotation.processors.Method> getDefaultMethods() {
        return defaultMethods_;
    }
    public boolean defaultMethodsContains(com.javadude.annotation.processors.Method value) {
        return defaultMethods_.contains(value);
    }
    public void addDefaultMethod(com.javadude.annotation.processors.Method value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to defaultMethod");
        defaultMethods_.add(value);
    }
    public void addDefaultMethod(int i, com.javadude.annotation.processors.Method value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to defaultMethod");
        defaultMethods_.add(i, value);
    }
    public void clearDefaultMethods() {
        defaultMethods_.clear();
    }

    private final java.util.List<com.javadude.annotation.processors.DelegateSpec> delegates_ = new java.util.ArrayList<com.javadude.annotation.processors.DelegateSpec>();
    public com.javadude.annotation.processors.DelegateSpec getDelegate(int i) {
        return delegates_.get(i);
    }
    public java.util.List<com.javadude.annotation.processors.DelegateSpec> getDelegates() {
        return delegates_;
    }
    public boolean delegatesContains(com.javadude.annotation.processors.DelegateSpec value) {
        return delegates_.contains(value);
    }
    public void addDelegate(com.javadude.annotation.processors.DelegateSpec value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to delegate");
        delegates_.add(value);
    }
    public void addDelegate(int i, com.javadude.annotation.processors.DelegateSpec value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to delegate");
        delegates_.add(i, value);
    }
    public void clearDelegates() {
        delegates_.clear();
    }

    private final java.util.List<com.javadude.annotation.processors.Type> nullImplementations_ = new java.util.ArrayList<com.javadude.annotation.processors.Type>();
    public com.javadude.annotation.processors.Type getNullImplementation(int i) {
        return nullImplementations_.get(i);
    }
    public java.util.List<com.javadude.annotation.processors.Type> getNullImplementations() {
        return nullImplementations_;
    }
    public boolean nullImplementationsContains(com.javadude.annotation.processors.Type value) {
        return nullImplementations_.contains(value);
    }
    public void addNullImplementation(com.javadude.annotation.processors.Type value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to nullImplementation");
        nullImplementations_.add(value);
    }
    public void addNullImplementation(int i, com.javadude.annotation.processors.Type value) {
        if (value == null) throw new IllegalArgumentException("Cannot add null to nullImplementation");
        nullImplementations_.add(i, value);
    }
    public void clearNullImplementations() {
        nullImplementations_.clear();
    }


    @Override
    public java.lang.String toString() {
        return getClass().getName() + '[' + paramString() + ']';
    }
    protected java.lang.String paramString() {
        return
               "packageName=" + packageName_ +
               ",className=" + className_ +
               ",date=" + date_ +
               ",classAccess=" + classAccess_ +
               ",superclass=" + superclass_ +
               ",cloneable=" + cloneable_ +
               ",spacesForLeadingTabs=" + spacesForLeadingTabs_ +
               ",atLeastOneBound=" + atLeastOneBound_ +
               ",definePropertyNameConstants=" + definePropertyNameConstants_ +
               ",extendPropertyNameConstants=" + extendPropertyNameConstants_ +
               ",equalsShouldCheckSuperEquals=" + equalsShouldCheckSuperEquals_ +
               ",superConstructorSuperCall=" + superConstructorSuperCall_ +
               ",superConstructorArgs=" + superConstructorArgs_ +
               ",year=" + year_ +
               ",defineSimpleEqualsAndHashCode=" + defineSimpleEqualsAndHashCode_ +
               ",createPropertyMap=" + createPropertyMap_ +
               ",createPropertyMapCallsSuper=" + createPropertyMapCallsSuper_ +
               ",properties=" + properties_ +
               ",observers=" + observers_ +
               ",defaultMethods=" + defaultMethods_ +
               ",delegates=" + delegates_ +
               ",nullImplementations=" + nullImplementations_;
    }
    public java.util.Map<java.lang.String, java.lang.Object> createPropertyMap() {
                    NullHoldingMap map = new NullHoldingMap();
                    map.put("packageName", getPackageName());
                    map.put("firstPropertyName", getFirstPropertyName());
                    map.put("className", getClassName());
                    map.put("date", getDate());
                    map.put("classAccess", getClassAccess());
                    map.put("superclass", getSuperclass());
                    map.put("cloneable", isCloneable());
                    map.put("spacesForLeadingTabs", getSpacesForLeadingTabs());
                    map.put("atLeastOneBound", isAtLeastOneBound());
                    map.put("atLeastOneDouble", isAtLeastOneDouble());
                    map.put("atLeastOneObject", isAtLeastOneObject());
                    map.put("definePropertyNameConstants", isDefinePropertyNameConstants());
                    map.put("extendPropertyNameConstants", isExtendPropertyNameConstants());
                    map.put("equalsShouldCheckSuperEquals", isEqualsShouldCheckSuperEquals());
                    map.put("superConstructorSuperCall", getSuperConstructorSuperCall());
                    map.put("superConstructorArgs", getSuperConstructorArgs());
                    map.put("year", getYear());
                    map.put("defineSimpleEqualsAndHashCode", isDefineSimpleEqualsAndHashCode());
                    map.put("createPropertyMap", isCreatePropertyMap());
                    map.put("createPropertyMapCallsSuper", isCreatePropertyMapCallsSuper());
                    map.put("properties", getProperties());
                    map.put("observers", getObservers());
                    map.put("defaultMethods", getDefaultMethods());
                    map.put("delegates", getDelegates());
                    map.put("nullImplementations", getNullImplementations());
        return map;
    }
}
