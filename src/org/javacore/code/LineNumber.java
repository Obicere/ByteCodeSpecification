package org.javacore.code;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.block.label.Label;

/**
 */
public interface LineNumber extends Identifiable {

    public Label getAddress();

    public void setAddress(final Label address);

    public int getLineNumber();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LINE_NUMBER;
    }
}
