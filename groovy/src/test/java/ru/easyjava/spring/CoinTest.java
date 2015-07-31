package ru.easyjava.spring;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CoinTest {
    @Test
    public void testToss() throws Exception {
        /** Prepare the mock */
        StubRandom random = new StubRandom();

        /** Prepare the object */
        Coin testedObject = new CoinImpl(random);

        /** Test it! */
        random.setConstantResult(true);
        assertTrue(testedObject.toss());

        random.setConstantResult(false);
        assertFalse(testedObject.toss());
    }
}
