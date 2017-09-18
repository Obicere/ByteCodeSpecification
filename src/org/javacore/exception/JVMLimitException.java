package org.javacore.exception;

/**
 */
public class JVMLimitException extends RuntimeException {

    public JVMLimitException(final String message, final int limit) {
        super(message + " limit: " + limit);
    }

}
