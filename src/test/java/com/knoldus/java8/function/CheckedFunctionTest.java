package com.knoldus.java8.function;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import org.junit.Test;

public class CheckedFunctionTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CheckedFunction#identity()}
     *   <li>{@link CheckedFunction#identity()}
     * </ul>
     */
    @Test
    public void testIdentity() throws IOException {
        assertEquals("42", CheckedFunction.identity().apply("42"));
    }
}

