package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTestAndPartialLinkTextTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link=driver.findElement(By.linkText("Exanple 6:Loading overlay that disappears and disappears again"));
        System.out.println(link.getText());

        WebElement cbt=driver.findElement(By.linkText("Cybertek School"));
        System.out.println(cbt.getText());

        WebElement link6again=driver.findElement(By.partialLinkText("Example 6"));
        System.out.println(link6again.getText());
    }
}
