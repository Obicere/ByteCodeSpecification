package org.javacore.type.generic;

import org.javacore.JCClass;
import org.javacore.type.TypedClass;

/**
 */
public interface ClassGenericDeclaration extends GenericDeclaration {

    @Override
    public JCClass getDeclarer();

    public TypedClass getGenericSuperClass();

    public TypedClass[] getGenericSuperInterfaces();

}
