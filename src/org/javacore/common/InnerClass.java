package org.javacore.common;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface InnerClass extends Identifiable {

    public String getInnerClassInfo();

    public String getOuterClassInfo();

    public String getInnerName();

    public int getInnerClassAccessFlags();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INNER_CLASS;
    }
}
