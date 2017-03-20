package org.javacore.code.block;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.block.label.Label;

/**
 */
public interface CodeBlock extends Identifiable {

    public Label getAddress();

    public void setAddress(final Label label);

    public String getName();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE_BLOCK;
    }

}
