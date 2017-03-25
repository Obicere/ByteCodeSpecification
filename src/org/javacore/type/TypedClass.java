package org.javacore.type;

import org.javacore.JCClass;

/**
 */
public interface TypedClass extends ReferenceType {

    public WildCardType[] getWildcardTypes();

    public void setWildcardTypes(final WildCardType[] arguments);

    public JCClass getRawType();

    public void setRawType(final JCClass rawType);

    public TypedClass getGenericOuterClass();

}
