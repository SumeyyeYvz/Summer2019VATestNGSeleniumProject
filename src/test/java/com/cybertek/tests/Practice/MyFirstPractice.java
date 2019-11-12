package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager .chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
      //  Thread.sleep(1000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag");
       // Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
       // Thread.sleep(3000);
      //  driver.quit();



    }
}
