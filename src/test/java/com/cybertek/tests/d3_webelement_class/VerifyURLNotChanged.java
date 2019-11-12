package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLNotChanged {
/*
open browser
go to http://practice.cybertekschool.com/forgot_password
click on Retrieve password
verify that url did not change
 */
    public static void main(String[] args) {
//open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save the expected url
        String expevctedUrl=driver.getCurrentUrl();

        //click on Retrieve password
        //WebElemet-->class that represent elements ftom the webpage
        //returns a webelemet
    WebElement retrievePassword=driver.findElement(By.id("from_submit"));
      retrievePassword.click();

      //verify that url did not change

        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.equals((expevctedUrl))){
            System.out.println("pass");
            System.out.println("FAIL");


        }

    }
}
