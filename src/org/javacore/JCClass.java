package org.javacore;

import org.javacore.annotation.Annotation;
import org.javacore.type.ReferenceType;
import org.javacore.type.generic.ClassGenericDeclaration;
import org.javacore.type.generic.Declaration;

/**
 */
public interface JCClass extends ReferenceType, Declaration<ClassGenericDeclaration>, Attributable {

    // Java spec required methods

    public int getMinorVersion();

    public int getMajorVersion();

    public int getAccessFlags();

    public String getName();

    public JCClass getSuperClass();

    public int getSuperInterfaceCount();

    public JCClass[] getSuperInterfaces();

    public int getFieldsCount();

    public JCField[] getFields();

    public int getMethodsCount();

    public JCMethod[] getMethods();

    // external required methods

    public String getPackage();

    public String getCanonicalName();

    public String getSimpleName();

    public JCClass getOuterClass();

    public JCClass getEnclosingClass();

    public JCMethod getEnclosingMethod();

    public Annotation[] getAnnotations();

    // default implementations for this spec object

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CLASS;
    }

    @Override
    default public boolean isArray() {
        return false;
    }

    @Override
    default public boolean isGeneric() {
        return false;
    }
}
