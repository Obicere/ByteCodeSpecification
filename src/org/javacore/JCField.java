package org.javacore;

/**
 */
public interface JCField extends IdentifiableNode {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FIELD;
    }
}
