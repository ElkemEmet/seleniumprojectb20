package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
    public void p1_information_alert_practice(){

        //Location the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        warningAlertButton.click();

        //1-create alert instance and switch to alert
        Alert alert = driver.switchTo().alert();

        BrowserUtils.wait(2);

        //2-Use alert instance to accept the javascript alert(popup)
        alert.accept();

        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed.Verification failed!!1");
    }

    @Test
    public void p2_confirmation_alert_practice(){
        //Location the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        warningAlertButton.click();

        //1-create alert instance and switch to alert
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(2);

        //we can either accept(),or dismiss() the confirmation alert
        // alert.dismiss();
        alert.accept();

        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Assert
        Assert.assertTrue(resultText.isDisplayed(),"Text is not displayed. verification failed!!!");



    }











}