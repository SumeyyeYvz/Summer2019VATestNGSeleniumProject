package com.cybertek.tests.Practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().clearPreferences();

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();


       driver.findElement(By.xpath("//*[text()='Sign Up For Mailing List']")).click();
        Thread.sleep(1000);
       //li[.='Sing Up For Mailing List']
       driver.findElement(By.xpath("//*[@name='full_name']")).sendKeys("SumeyyeYavuz");
       driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sumeyyeyvz95@gmail.com");
       driver.findElement(By.xpath("//*[@name='wooden_spoon']")).click();

       String message=driver.findElement(By.xpath("//*[@name='signup_message']")).getText();
       System.out.println("actual message "+message);

       boolean b1=message.equals("Thank you for signing up. Click the button below to return to the home page.");
       System.out.println("message status "+b1);

        WebElement homeButton=driver.findElement(By.id("wooden_spoon"));


        if(homeButton.isDisplayed()){
            System.out.println("Home button is display");
            homeButton.click();
        }else{
            System.out.println("NoSuchElementException");
        }
            driver.close();






    }
}
