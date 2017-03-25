package org.javacore.type;

import org.javacore.type.generic.Declaration;

/**
 * @author Obicere
 */
public interface TypeRepository {

    public Type getType(final String name);

    public Type getType(final String name, final Declaration<?> scope);
}
