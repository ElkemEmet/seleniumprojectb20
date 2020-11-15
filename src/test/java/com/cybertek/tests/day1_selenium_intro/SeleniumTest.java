package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        //1- setup the driver
         WebDriverManager.chromedriver().setup();

        //2- Create instance of the driver
         WebDriver driver = new ChromeDriver();

        //3- Use the driver instance to test selenium
         driver.get("https://www.google.com");

         String actualTitle = driver.getTitle();
         System.out.println("ACTUAL TITLE STRING: "+ actualTitle);

         String actualUrl = driver.getCurrentUrl();

         System.out.println("actualUrl = " + actualUrl);



        System.out.println("The title of the page is: : "+ driver.getTitle() );

        Thread.sleep(2000);

         driver.navigate().back();

        Thread.sleep(2000);

         driver.navigate().forward();

         Thread.sleep(2000);

         driver.navigate().refresh();

         Thread.sleep(2000);

         driver.navigate().to("https://www.facebook.com/");

         String pageSource = driver.getPageSource();

         System.out.println("pageSource: "+ pageSource);

         driver.manage().window().maximize();

        driver.close(); // close last one

        driver.quit(); // close all of them
    }
}
