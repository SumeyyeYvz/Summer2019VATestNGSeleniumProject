package com.cybertek.tests.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonLocaterDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

     Thread.sleep(200);
     driver.findElement(By.tagName("input")).sendKeys("Sumeyye Yavuz");

     Thread.sleep(200);
     driver.findElement(By.name("email")).sendKeys("sumeyyeyvz95@gmail.com");

     Thread.sleep(100);
     driver.findElement(By.tagName("button")).click();


    }

}
