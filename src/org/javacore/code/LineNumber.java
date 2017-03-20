package org.javacore.code;

import org.javacore.code.block.label.Label;

/**
 */
public interface LineNumber {

    public Label getAddress();

    public void setAddress(final Label address);

    public int getLineNumber();
}
