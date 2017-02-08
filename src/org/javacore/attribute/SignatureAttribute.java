package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface SignatureAttribute extends Attribute {

    public String getSignature();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SIGNATURE_ATTRIBUTE;
    }

}
