package com.cybertek.tests.PracticeTask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElements_Apple01 {
    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to iPhone
        WebElement iphone =driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iphone.click();

        // 4.Print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for(WebElement link : allLinks){
            String textOfLinks = link.getText();
            System.out.println(textOfLinks);

           if(textOfLinks.isEmpty()){
              linksWithoutText++;
           }else{
              linksWithText++;
           }

        }

        // 5.Print out how many link is missing text
        System.out.println("The number of links that does not have text = " + linksWithoutText);

        // 6.Print out how many link has text
        System.out.println("The number of links that HAS text = " + linksWithText);

        // 7.Print out how many total link
        System.out.println("Total links is: "+allLinks.size());


    }
}
