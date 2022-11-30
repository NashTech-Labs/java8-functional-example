package com.knoldus.java8.function;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FunctionWithExceptionTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link FunctionWithException#identity()}
     *   <li>{@link FunctionWithException#identity()}
     * </ul>
     */
    @Test
    public void testIdentity() {
        assertEquals("44", FunctionWithException.identity().apply("44"));
        assertEquals("42", FunctionWithException.identity().apply("42"));
    }
}

