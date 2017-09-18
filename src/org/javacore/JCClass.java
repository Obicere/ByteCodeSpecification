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

import java.util.function.Predicate;
import java.util.stream.Stream;

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

    // library functionality

    public boolean addMethod(final JCMethod method);

    public boolean addMethods(final JCMethod ... methods);

    public boolean addMethods(final JCMethod[] methods, final int start, final int length);

    public boolean addMethods(final Iterable<JCMethod> methods);

    public boolean addMethods(final JCMethod[] methods, final Predicate<JCMethod> condition);

    public boolean addMethods(final Iterable<JCMethod> methods, final Predicate<JCMethod> condition);

    public JCMethod removeMethod(final JCMethod method);

    public JCMethod removeMethod(final String name);

    public JCMethod removeMethod(final int index);

    public JCMethod removeMethod(final Predicate<JCMethod> condition);

    public JCMethod[] removeMethods(final String name);

    public JCMethod[] removeMethods(final int[] indices);

    public JCMethod[] removeMethods(final int start, final int length);

    public JCMethod[] removeMethods(final Iterable<JCMethod> methods);

    public JCMethod[] removeMethods(final Predicate<JCMethod> condition);

    public JCMethod[] removeAllMethods();

    public Stream<JCMethod> streamMethods();

    public boolean containsMethod(final JCMethod method);

    public boolean containsMethods(final JCMethod method);

    public JCMethod getMethod(final String name);

    public JCMethod[] getMethods(final String name);

    public JCMethod[] getMethods(final Predicate<JCMethod> condition);

    public JCMethod[] getMethods(final int start, final int length);
    
    public boolean addField(final JCField method);

    public boolean addFields(final JCField ... methods);

    public boolean addFields(final JCField[] methods, final int start, final int length);

    public boolean addFields(final Iterable<JCField> methods);

    public boolean addFields(final JCField[] methods, final Predicate<JCField> condition);

    public boolean addFields(final Iterable<JCField> methods, final Predicate<JCField> condition);

    public JCField removeField(final JCField method);

    public JCField removeField(final String name);

    public JCField removeField(final int index);

    public JCField removeField(final Predicate<JCField> condition);

    public JCField[] removeFields(final String name);

    public JCField[] removeFields(final int[] indices);

    public JCField[] removeFields(final int start, final int length);

    public JCField[] removeFields(final Iterable<JCField> methods);

    public JCField[] removeFields(final Predicate<JCField> condition);

    public JCField[] removeAllFields();

    public Stream<JCField> streamFields();

    public boolean containsField(final JCField method);

    public boolean containsFields(final JCField method);

    public JCField getField(final String name);

    public JCField[] getFields(final String name);

    public JCField[] getFields(final Predicate<JCField> condition);

    public JCField[] getFields(final int start, final int length);

    public boolean addInnerClass(final JCClass innerClass);

    public boolean addInnerClasses(final JCClass[] innerClasses);

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
