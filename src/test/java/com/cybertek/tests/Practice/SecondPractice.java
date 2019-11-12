package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SecondPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());

       driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Turk is adami Sami Yavuz kimdir?");
      // Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
       //Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/div[1]/a[1]/h3")).click();
      // Thread.sleep(5000);
       driver.quit();



    }
}
