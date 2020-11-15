package com.cybertek.tests.PracticeTask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElements_Apple02 {
    public static void main(String[] args) {

        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by one
        // a.Mac, iPad, iPhone, Watch, TV, Music, Support
        List<WebElement> appleHeader = driver.findElements((By.xpath("//ul[@class='ac-gn-list']/li/a")));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for(int i =1;i<8;i++) {

            for (WebElement link : appleHeader) {
                String textOfLinks = link.getText();
                System.out.println(textOfLinks);

                if (textOfLinks.isEmpty()) {
                    linksWithoutText++;
                } else {
                    linksWithText++;
                }
            }
            driver.navigate().back();
            appleHeader = driver.findElements((By.xpath("//ul[@class='ac-gn-list']/li/a")));
        }

        // The loop where we specify where to start from and where end in appleHeader List.

        // 4.Printout how many links on each page with the titles of the pages

        // 5.Loop through all
        // 6.Print out how many link is missing textTOTAL
        System.out.println("The number of links that does not have text = " + linksWithoutText);
        // 7.Print out how many link has textTOTAL
        System.out.println("The number of links that HAS text = " + linksWithText);
        // 8.Print out how many total linkTOTAL
        System.out.println("Total links is: "+appleHeader.size());
    }
}
