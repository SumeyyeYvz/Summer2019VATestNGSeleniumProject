package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallTheFactory {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
       WebDriver driver1=WebDriverFactory.getDriver("firefox");


    }

}
