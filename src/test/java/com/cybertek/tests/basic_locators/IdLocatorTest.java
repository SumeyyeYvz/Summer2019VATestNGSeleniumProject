package com.cybertek.tests.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();

//        Thread.sleep(500);
//        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();



        Thread.sleep(500);
        driver.findElement(By.id("disappearing_button"));



    }

}
