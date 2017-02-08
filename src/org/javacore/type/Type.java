package org.javacore.type;

/**
 * @author Obicere
 */
public interface Type {

    public String getName();

    public String getSimpleName();

    public String getCanonicalName();

    public boolean isPrimitive();

    public boolean isGeneric();

    public boolean isArray();

    public boolean isReference();

}
