package org.javacore.attribute;

import org.javacore.Identifier;

/**
 * @author Obicere
 */
public class Attributes {

    public static final String CONSTANT_VALUE_ATTRIBUTE_NAME                          = "ConstantValue";
    public static final String CODE_ATTRIBUTE_NAME                                    = "Code";
    public static final String EXCEPTIONS_ATTRIBUTE_NAME                              = "Exceptions";
    public static final String SOURCE_FILE_ATTRIBUTE_NAME                             = "SourceFile";
    public static final String LINE_NUMBER_TABLE_ATTRIBUTE_NAME                       = "LineNumberTable";
    public static final String LOCAL_VARIABLE_TABLE_ATTRIBUTE_NAME                    = "LocalVariableTable";
    public static final String INNER_CLASSES_ATTRIBUTE_NAME                           = "InnerClasses";
    public static final String SYNTHETIC_ATTRIBUTE_NAME                               = "Synthetic";
    public static final String DEPRECATED_ATTRIBUTE_NAME                              = "Deprecated";
    public static final String ENCLOSING_METHOD_ATTRIBUTE_NAME                        = "EnclosingMethod";
    public static final String SIGNATURE_ATTRIBUTE_NAME                               = "Signature";
    public static final String SOURCE_DEBUG_EXTENSION_ATTRIBUTE_NAME                  = "SourceDebugExtension";
    public static final String LOCAL_VARIABLE_TYPE_TABLE_ATTRIBUTE_NAME               = "LocalVariableTypeTable";
    public static final String RUNTIME_VISIBLE_ANNOTATIONS_ATTRIBUTE_NAME             = "RuntimeVisibleAnnotations";
    public static final String RUNTIME_INVISIBLE_ANNOTATIONS_ATTRIBUTE_NAME           = "RuntimeInvisibleAnnotations";
    public static final String RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE_NAME   = "RuntimeVisibleParameterAnnotations";
    public static final String RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE_NAME = "RuntimeInvisibleParameterAnnotations";
    public static final String RUNTIME_VISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE_NAME        = "RuntimeVisibleTypeAnnotations";
    public static final String RUNTIME_INVISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE_NAME      = "RuntimeInvisibleTypeAnnotations";
    public static final String ANNOTATION_DEFAULT_ATTRIBUTE_NAME                      = "AnnotationDefault";
    public static final String STACK_MAP_TABLE_ATTRIBUTE_NAME                         = "StackMapTable";
    public static final String BOOTSTRAP_METHODS_ATTRIBUTE_NAME                       = "BootstrapMethods";
    public static final String METHOD_PARAMETERS_ATTRIBUTE_NAME                       = "MethodParameters";

    public static Identifier of(final String name) {
        switch (name) {
            case CONSTANT_VALUE_ATTRIBUTE_NAME:
                return Identifier.CONSTANT_VALUE_ATTRIBUTE;
            case CODE_ATTRIBUTE_NAME:
                return Identifier.CODE_ATTRIBUTE;
            case EXCEPTIONS_ATTRIBUTE_NAME:
                return Identifier.EXCEPTIONS_ATTRIBUTE;
            case SOURCE_FILE_ATTRIBUTE_NAME:
                return Identifier.SOURCE_FILE_ATTRIBUTE;
            case LINE_NUMBER_TABLE_ATTRIBUTE_NAME:
                return Identifier.LINE_NUMBER_TABLE_ATTRIBUTE;
            case LOCAL_VARIABLE_TABLE_ATTRIBUTE_NAME:
                return Identifier.LOCAL_VARIABLE_TABLE_ATTRIBUTE;
            case INNER_CLASSES_ATTRIBUTE_NAME:
                return Identifier.INNER_CLASSES_ATTRIBUTE;
            case SYNTHETIC_ATTRIBUTE_NAME:
                return Identifier.SYNTHETIC_ATTRIBUTE;
            case DEPRECATED_ATTRIBUTE_NAME:
                return Identifier.DEPRECATED_ATTRIBUTE;
            case ENCLOSING_METHOD_ATTRIBUTE_NAME:
                return Identifier.ENCLOSING_METHOD_ATTRIBUTE;
            case SIGNATURE_ATTRIBUTE_NAME:
                return Identifier.SIGNATURE_ATTRIBUTE;
            case SOURCE_DEBUG_EXTENSION_ATTRIBUTE_NAME:
                return Identifier.SOURCE_DEBUG_EXTENSION_ATTRIBUTE;
            case LOCAL_VARIABLE_TYPE_TABLE_ATTRIBUTE_NAME:
                return Identifier.LOCAL_VARIABLE_TYPE_TABLE_ATTRIBUTE;
            case RUNTIME_VISIBLE_ANNOTATIONS_ATTRIBUTE_NAME:
                return Identifier.RUNTIME_VISIBLE_ANNOTATIONS_ATTRIBUTE;
            case RUNTIME_INVISIBLE_ANNOTATIONS_ATTRIBUTE_NAME:
                return Identifier.RUNTIME_INVISIBLE_ANNOTATIONS_ATTRIBUTE;
            case RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE_NAME:
                return Identifier.RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE;
            case RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE_NAME:
                return Identifier.RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE;
            case RUNTIME_VISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE_NAME:
                return Identifier.RUNTIME_VISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE;
            case RUNTIME_INVISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE_NAME:
                return Identifier.RUNTIME_INVISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE;
            case ANNOTATION_DEFAULT_ATTRIBUTE_NAME:
                return Identifier.ANNOTATION_DEFAULT_ATTRIBUTE;
            case STACK_MAP_TABLE_ATTRIBUTE_NAME:
                return Identifier.STACK_MAP_TABLE_ATTRIBUTE;
            case BOOTSTRAP_METHODS_ATTRIBUTE_NAME:
                return Identifier.BOOTSTRAP_METHODS_ATTRIBUTE;
            case METHOD_PARAMETERS_ATTRIBUTE_NAME:
                return Identifier.METHOD_PARAMETERS_ATTRIBUTE;
            default:
                return Identifier.UNKNOWN_ATTRIBUTE;
        }
    }

}
