package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 * @author Obicere
 */
public class VerificationTypeInfos {

    public static final int ITEM_TOP                = 0;
    public static final int ITEM_INTEGER            = 1;
    public static final int ITEM_FLOAT              = 2;
    public static final int ITEM_DOUBLE             = 3;
    public static final int ITEM_LONG               = 4;
    public static final int ITEM_NULL               = 5;
    public static final int ITEM_UNINITIALIZED_THIS = 6;
    public static final int ITEM_OBJECT             = 7;
    public static final int ITEM_UNINITIALIZED      = 8;

    public static Identifier of(final int item) {
        switch (item) {
            case ITEM_TOP:
                return Identifier.TOP_VARIABLE_INFO;
            case ITEM_INTEGER:
                return Identifier.INTEGER_VARIABLE_INFO;
            case ITEM_FLOAT:
                return Identifier.FLOAT_VARIABLE_INFO;
            case ITEM_DOUBLE:
                return Identifier.DOUBLE_VARIABLE_INFO;
            case ITEM_LONG:
                return Identifier.LONG_VARIABLE_INFO;
            case ITEM_NULL:
                return Identifier.NULL_VARIABLE_INFO;
            case ITEM_UNINITIALIZED_THIS:
                return Identifier.UNINITIALIZED_THIS_VARIABLE_INFO;
            case ITEM_OBJECT:
                return Identifier.OBJECT_VARIABLE_INFO;
            case ITEM_UNINITIALIZED:
                return Identifier.UNINITIALIZED_VARIABLE_INFO;
            default:
                return null;
        }
    }
}
