package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(); //this open website

        driver.get("https://cybertekschool.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        //this is not from selenium,it is from java
        //it pauses the program

        Thread.sleep(1000);
       driver.navigate().forward();
      //  driver.navigate().to("https://www.amazon.com");
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        /*
        Java:it is programming language in which we write our tests
        IntelliJ:WE use it to write and execute our code/test
        Eclipse:we use it to write and execute our code/test
        selenium:automation tool,it is just another library
        Library/dependency:set of prewritten classes,methods which we can add to our code and use
        Maven:build management tool,we use it to manage dependencies.We add selenium testing etc using maven

         */
    }
}
