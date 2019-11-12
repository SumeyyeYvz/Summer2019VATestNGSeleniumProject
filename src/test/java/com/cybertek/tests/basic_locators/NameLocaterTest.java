package com.cybertek.tests.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocaterTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

     Thread.sleep(200);
     driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/input")).sendKeys("Sumeyye Yavuz");
     Thread.sleep(200);
     driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/input")).sendKeys("sumeyyeyvz95@gmail.com");
     Thread.sleep(200);
     driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

     driver.quit();
    }
}
