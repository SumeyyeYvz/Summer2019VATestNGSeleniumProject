package com.cybertek.tests.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocaterTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

       WebElement home=driver.findElement(By.className("nav-link"));
       home.click();

       WebElement title=driver.findElement(By.className("h3"));

       System.out.println(title.getText());

    }
}
