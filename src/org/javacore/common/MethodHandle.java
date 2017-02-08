package org.javacore.common;

import org.javacore.reference.Reference;
import org.javacore.reference.ReferenceKind;

/**
 */
public interface MethodHandle<R> {

    public Reference<R> getReference();

    public ReferenceKind getReferenceKind();

}
