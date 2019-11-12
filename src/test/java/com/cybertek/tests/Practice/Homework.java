package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
        System.out.println(driver.getTitle());

driver.findElement(By.id("prependedInput")).sendKeys("user10");
Thread.sleep(1000);
driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
driver.findElement(By.xpath("//*[@class='btn btn-uppercase btn-primary pull-right']")).click();
Thread.sleep(1000);

        String expected = "https://qa2.vytrack.com/";
        String actual = driver.getCurrentUrl();
        if (expected.equals(actual)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        driver.quit();





    }

}
