package org.javacore.annotation.path;

/**
 */
public enum PathKind {

    ARRAY,
    NESTED,
    WILDCARD,
    TYPE_PARAMETER;

    public int getType() {
        // for now this works, additional types may be added
        // so this should remain modifiable
        return ordinal();
    }

    public static PathKind of(final int type) {
        switch (type) {
            case 0:
                return ARRAY;
            case 1:
                return NESTED;
            case 2:
                return WILDCARD;
            case 3:
                return TYPE_PARAMETER;
            default:
                throw new IllegalArgumentException("no path kind for type " + type);
        }
    }

}
