package com.cybertek.tests.d6_testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    //this one will be fail
    @Test
    public void test1(){
     System.out.println("this is the first test");
    }
    @Test
    public void test2(){
        System.out.println("This is the second test");
    }

    @Test
    public void test3(){
        String expectedTitle="Cbt";
        String actualTitleBeg="c";

        Assert.assertTrue(expectedTitle.startsWith(actualTitleBeg));
        Assert.assertTrue("ma@cbt.com".contains("@"),"all emails must contains @ sing");
        Assert.assertTrue(1>0);
     //   System.out.println("a".equals(("a")));
    }

    @Test
    public void test4(){
      Assert.assertFalse(1<0);
    }

    @Test
    public void test5(){
        Assert.assertEquals("Cbt","Ccbt","Title did not match");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("close chrome");

    }
}
