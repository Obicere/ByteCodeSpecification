package org.javacore;

/**
 */
public interface JCField extends Attributable {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FIELD;
    }
}
