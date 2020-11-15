package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_PracticeCybertek_Xpath {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");


            WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        //  WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']")); same way
       //   WebElement button2 = driver.findElement(By.xpath("//button[.='Button 2']")); same way
            button2.click();
    }
}
