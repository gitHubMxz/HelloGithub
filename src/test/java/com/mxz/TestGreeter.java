package com.mxz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGreeter {

    @Before
    public void init() {
        System.out.println("before test,...");
    }

    @Test
    public void testSayHello () {
        Assert.assertNotNull(new Object());
    }
}
