package com.cybertek.tests.PracticeTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_VehicleOdometerPage {

    public static void main(String[] args) throws InterruptedException {

        //1- setup the driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the driver
        WebDriver driver = new ChromeDriver();

        //3- Use the driver instance to test selenium
        driver.get("https://qa2.vytrack.com/user/login");

        //4.enter correct username
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput")).sendKeys("user172");

        //5.enter correct password
        Thread.sleep(2000);
        driver.findElement(By.name("_password")).sendKeys("UserUser123");

        //6.click Login button
        Thread.sleep(2000);
        driver.findElement(By.id("_submit")).click();
        //click fleet manu
        driver.manage().window().maximize();

        //7.findElement for dropdown
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Vehicle Odometer")).click();
        Thread.sleep(2000);


        String expectedCarInfo = "Vehicles Odometers";
        String actualCarInfo = driver.findElement(By.xpath("//h1[@class='oro-subtitle']") ).getText();

        if(actualCarInfo.equals(expectedCarInfo)){
            System.out.println("Vehicles Odometers page displayed is passed!");
        }else{
            System.out.println("Vehicles Odometers page displayed is failed!");
        }

    }
}