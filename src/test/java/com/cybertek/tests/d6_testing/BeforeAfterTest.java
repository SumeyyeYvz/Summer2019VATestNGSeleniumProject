package com.cybertek.tests.d6_testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterTest{

    @Test
    public void test1(){
        System.out.println("This is test one");
    }
    @Test
    public void test2(){
        System.out.println("This is test two");
    }


    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method");
        System.out.println("opening chrome");

    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("Before method");
        System.out.println("closing chrome");
    }

    @BeforeClass
    public void setupclass(){
        System.out.println("Before class: running only one time");
    }

}

