package ru.easyjava.spring;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GreeterTargetTest {
    @Test
    public void testGet() throws Exception {
        /* Prepare the mock */
        StubCoin coin = new StubCoin();

        /* Prepare the Object */
        GreeterTarget testedObject = new GreeterTargetImpl(coin);

        /* Test it! */
        coin.setConstantResult(true);
        assertEquals("World", testedObject.get());

        coin.setConstantResult(false);
        assertEquals("Spring", testedObject.get());
    }
}
