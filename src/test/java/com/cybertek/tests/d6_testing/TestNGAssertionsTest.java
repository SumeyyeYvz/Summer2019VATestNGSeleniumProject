package com.cybertek.tests.d6_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void Test1(){
        System.out.println("first assertion");
        Assert.assertEquals("one","one");

        System.out.println("second assertion");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertNotEquals("one","two");
    }
}
