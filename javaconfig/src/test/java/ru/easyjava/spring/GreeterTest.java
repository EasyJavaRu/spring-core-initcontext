package ru.easyjava.spring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {
    @Test
    public void testGreet() throws Exception {
        /* Prepare the mock */
        GreeterTarget target = new StubGreeterTarget();

        /* Prepare the Object */
        Greeter testedObject = new Greeter(target);

        /* Test it! */
        assertEquals("Hello TEST", testedObject.greet());
    }
}
