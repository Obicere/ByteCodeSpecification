package org.javacore.type.factory;

import org.javacore.type.ArrayType;
import org.javacore.type.GenericType;
import org.javacore.type.PrimitiveType;
import org.javacore.type.TypedClass;
import org.javacore.type.VoidType;
import org.javacore.type.WildCardIndicator;
import org.javacore.type.WildCardType;
import org.javacore.type.signature.ClassTypeSignature;
import org.javacore.type.signature.ReferenceTypeSignature;
import org.javacore.type.signature.TypeSignature;
import org.javacore.type.signature.TypeVariableSignature;

/**
 * @author Obicere
 */
public interface TypeFactory {

    public TypedClass createClassType(final ClassTypeSignature name);

    public ArrayType createArrayType(final TypeSignature type);

    public GenericType createGenericType(final String name, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds);

    public GenericType getGenericType(final TypeVariableSignature name);

    public WildCardType createWildcardType(final WildCardIndicator indicator, final ReferenceTypeSignature bound);

    public PrimitiveType createBooleanType();

    public PrimitiveType createByteType();

    public PrimitiveType createShortType();

    public PrimitiveType createCharType();

    public PrimitiveType createIntType();

    public PrimitiveType createFloatType();

    public PrimitiveType createLongType();

    public PrimitiveType createDoubleType();

    public VoidType createVoidType();

}
