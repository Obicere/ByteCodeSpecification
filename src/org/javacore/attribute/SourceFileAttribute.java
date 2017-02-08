package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface SourceFileAttribute extends Attribute {

    public String getSourceFile();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SOURCE_FILE_ATTRIBUTE;
    }

}
