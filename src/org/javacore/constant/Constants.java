package org.javacore.constant;

import org.javacore.Identifier;

/**
 * @author Obicere
 */
public class Constants {

    public static final int CONSTANT_UTF8                 = 1;
    public static final int CONSTANT_INTEGER              = 3;
    public static final int CONSTANT_FLOAT                = 4;
    public static final int CONSTANT_LONG                 = 5;
    public static final int CONSTANT_DOUBLE               = 6;
    public static final int CONSTANT_CLASS                = 7;
    public static final int CONSTANT_STRING               = 8;
    public static final int CONSTANT_FIELD_REF            = 9;
    public static final int CONSTANT_METHOD_REF           = 10;
    public static final int CONSTANT_INTERFACE_METHOD_REF = 11;
    public static final int CONSTANT_NAME_AND_TYPE        = 12;
    public static final int CONSTANT_METHOD_HANDLE        = 15;
    public static final int CONSTANT_METHOD_TYPE          = 16;
    public static final int CONSTANT_INVOKE_DYNAMIC       = 18;

    public static Identifier of(final int tag) {
        switch (tag) {
            case CONSTANT_UTF8:
                return Identifier.CONSTANT_UTF8;
            case CONSTANT_INTEGER:
                return Identifier.CONSTANT_INTEGER;
            case CONSTANT_FLOAT:
                return Identifier.CONSTANT_FLOAT;
            case CONSTANT_LONG:
                return Identifier.CONSTANT_LONG;
            case CONSTANT_DOUBLE:
                return Identifier.CONSTANT_DOUBLE;
            case CONSTANT_CLASS:
                return Identifier.CONSTANT_CLASS;
            case CONSTANT_STRING:
                return Identifier.CONSTANT_STRING;
            case CONSTANT_FIELD_REF:
                return Identifier.CONSTANT_FIELD_REF;
            case CONSTANT_METHOD_REF:
                return Identifier.CONSTANT_METHOD_REF;
            case CONSTANT_INTERFACE_METHOD_REF:
                return Identifier.CONSTANT_INTERFACE_METHOD_REF;
            case CONSTANT_NAME_AND_TYPE:
                return Identifier.CONSTANT_NAME_AND_TYPE;
            case CONSTANT_METHOD_HANDLE:
                return Identifier.CONSTANT_METHOD_HANDLE;
            case CONSTANT_METHOD_TYPE:
                return Identifier.CONSTANT_METHOD_TYPE;
            case CONSTANT_INVOKE_DYNAMIC:
                return Identifier.CONSTANT_INVOKE_DYNAMIC;
            default:
                return null;
        }
    }
}
