package com.telenav.learngradle.app.tests;

import android.test.suitebuilder.annotation.SmallTest;

import com.telenav.learngradle.app.NumberAdder;

import junit.framework.TestCase;

/**
 * Created by Bo on 4/23/2014.
 */
public class NumberAdderTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testNumberAdder() {
        assertEquals(5, NumberAdder.adder(2, 3));
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
