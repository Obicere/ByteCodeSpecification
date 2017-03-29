package org.javacore;

import org.javacore.annotation.Annotation;
import org.javacore.attribute.AttributeSet;
import org.javacore.attribute.UnknownAttribute;
import org.javacore.common.BootstrapMethod;
import org.javacore.type.GenericType;
import org.javacore.type.ReferenceType;
import org.javacore.type.TypedClass;
import org.javacore.type.generic.ClassGenericDeclaration;
import org.javacore.type.generic.Declaration;

/**
 */
public interface JCClass extends ReferenceType, Declaration<ClassGenericDeclaration>, Attributable {

    // Java spec required methods

    public int getMinorVersion();

    public void setMinorVersion(final int minorVersion);

    public int getMajorVersion();

    public void setMajorVersion(final int majorVersion);

    public int getAccessFlags();

    public void setAccessFlags(final int accessFlags);

    public String getName();

    public void setName(final String name);

    public void setSuperName(final String superName);

    public JCClass getSuperClass();

    public TypedClass getGenericSuperClass();

    public void setSuperClass(final JCClass superClass);

    public void setGenericSuperClass(final TypedClass genericSuperClass);

    public void setSuperInterfaces(final String[] superInterfaces);

    public int getSuperInterfaceCount();

    public JCClass[] getSuperInterfaces();

    public TypedClass[] getGenericSuperInterfaces();

    public void setSuperInterfaces(final JCClass[] superInterfaces);

    public void setGenericSuperInterfaces(final TypedClass[] genericSuperInterfaces);

    public int getFieldsCount();

    public JCField[] getFields();

    public void setFields(final JCField[] fields);

    public int getMethodsCount();

    public JCMethod[] getMethods();

    public void setMethods(final JCMethod[] methods);

    // attributes

    public String getSourceFile();

    public void setSourceFile(final String sourceFile);

    public String getSourceDebugExtension();

    public void setSourceDebugExtension(final String sourceDebugExtension);

    public GenericType[] getGenericTypes();

    public void setGenericTypes(final GenericType[] genericTypes);

    public JCClass[] getInnerClasses();

    public void setInnerClasses(final JCClass[] innerClasses);

    public BootstrapMethod[] getBootstrapMethods();

    public void setBootstrapMethods(final BootstrapMethod[] bootstrapMethods);

    public boolean isSynthetic();

    public void setSynthetic(final boolean synthetic);

    public boolean isDeprecated();

    public void setDeprecated(final boolean deprecated);

    public void setAttributes(final AttributeSet attributes);

    public UnknownAttribute[] getUnknownAttributes();

    public void setUnknownAttributes(final UnknownAttribute[] unknownAttributes);

    // external required methods

    public String getPackage();

    public String getCanonicalName();

    public String getSimpleName();

    public boolean isOuterClass();

    public boolean isInnerClass();

    public boolean isNestedClass();

    public boolean isLocalClass();

    public boolean isAnonymousClass();

    public boolean isMemberClass();

    public boolean isEnclosedClass();

    public JCClass getOuterClass();

    public void setOuterClass(final JCClass outerClass);

    public JCClass getEnclosingClass();

    public JCMethod getEnclosingMethod();

    public void setEnclosingMethod(final JCMethod enclosingMethod);

    public Annotation[] getAnnotations();

    public void setAnnotations(final Annotation[] annotations);

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
