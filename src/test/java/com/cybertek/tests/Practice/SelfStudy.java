package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfStudy {

    final static String QA_ENVIROMENT="https://login1.nextbasecrm.com";
    final static String userName1="helpdesk11@cybertekschool.com";
    final static String passWord1="UserUser";

    public static void main(String[] args) {

        WebDriverManager.chromedriver().clearPreferences();

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get(QA_ENVIROMENT);
        WebElement userName,password,logIn;

        userName=driver.findElement(By.xpath("//*[@class='login-inp']"));
        userName.sendKeys(userName1);
        password=driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys(passWord1);
        logIn=driver.findElement(By.xpath("//*[@value='Log In']"));
        logIn.click();

        driver.findElement(By.xpath("//*[text()='Message']")).click();



    }
}
