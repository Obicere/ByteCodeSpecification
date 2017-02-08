package org.javacore.type;

import org.javacore.JCClass;

/**
 */
public interface TypedClass extends ReferenceType {

    public WildCardType[] getWildcardTypes();

    public JCClass getRawType();

    public TypedClass getGenericOuterClass();

}
