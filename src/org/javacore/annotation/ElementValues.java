package org.javacore.annotation;

import org.javacore.Identifier;

/**
 * @author Obicere
 */
public class ElementValues {
    public static final int TAG_BYTE       = 'B';
    public static final int TAG_CHARACTER  = 'C';
    public static final int TAG_DOUBLE     = 'D';
    public static final int TAG_FLOAT      = 'F';
    public static final int TAG_INTEGER    = 'I';
    public static final int TAG_LONG       = 'J';
    public static final int TAG_SHORT      = 'S';
    public static final int TAG_BOOLEAN    = 'Z';
    public static final int TAG_STRING     = 's';
    public static final int TAG_ENUM       = 'e';
    public static final int TAG_CLASS      = 'c';
    public static final int TAG_ANNOTATION = '@';
    public static final int TAG_ARRAY      = '[';

    public static Identifier of(final int tag) {
        switch (tag) {
            case TAG_BYTE:
                return Identifier.BYTE_ELEMENT_VALUE;
            case TAG_CHARACTER:
                return Identifier.CHARACTER_ELEMENT_VALUE;
            case TAG_DOUBLE:
                return Identifier.DOUBLE_ELEMENT_VALUE;
            case TAG_FLOAT:
                return Identifier.FLOAT_ELEMENT_VALUE;
            case TAG_INTEGER:
                return Identifier.INTEGER_ELEMENT_VALUE;
            case TAG_LONG:
                return Identifier.LONG_ELEMENT_VALUE;
            case TAG_SHORT:
                return Identifier.SHORT_ELEMENT_VALUE;
            case TAG_BOOLEAN:
                return Identifier.BOOLEAN_ELEMENT_VALUE;
            case TAG_STRING:
                return Identifier.STRING_ELEMENT_VALUE;
            case TAG_ENUM:
                return Identifier.ENUM_ELEMENT_VALUE;
            case TAG_CLASS:
                return Identifier.CLASS_ELEMENT_VALUE;
            case TAG_ANNOTATION:
                return Identifier.ANNOTATION_ELEMENT_VALUE;
            case TAG_ARRAY:
                return Identifier.ARRAY_ELEMENT_VALUE;
            default:
                return null;
        }
    }

}
