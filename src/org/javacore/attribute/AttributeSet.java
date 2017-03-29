package org.javacore.attribute;

import java.util.Set;

/**
 * @author Obicere
 */
public interface AttributeSet {

    public int getSize();

    public boolean isEmpty();

    public <T extends Attribute> Set<T> getAttributes(final Class<T> cls);

    public <T extends Attribute> T getAttribute(final Class<T> cls)    ;

    public void removeAttributes(final Class<? extends Attribute> cls);

    public void removeAttribute(final Class<? extends Attribute> cls) ;
}
