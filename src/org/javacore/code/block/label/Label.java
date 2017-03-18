package org.javacore.code.block.label;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.Code;

/**
 * @author Obicere
 */
public interface Label extends Identifiable {

    public String getName();

    public Code getCode();

    public int getAddress();

    public void setAddress(final int address);

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LABEL;
    }

}
