package com.cybertek.tests.PracticeTask;

import com.cybertek.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Create_Quote {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login2.nextbasecrm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk22@cybertekschool.com"+ Keys.ENTER);
        //driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+Keys.ENTER);

        Thread.sleep(2000);
         driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk22@cybertekschool.com");
         Thread.sleep(2000);
         driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
         Thread.sleep(2000);
         driver.findElement(By.id("USER_REMEMBER")).click();

         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type='submit']")).click();
         Thread.sleep(2000);
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();
         Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@title='Quote text']")).click();

        Thread.sleep(2000);
        // driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']")).sendKeys("123"+ Keys.ENTER);

        WebElement iframe = driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']       "));
        driver.switchTo().defaultContent();
        BrowserUtils.wait(2);

        Thread.sleep(2000);
        driver.findElement(By.id("blog-submit-button-save")).click();

        // driver.findElement(By.name("br")).sendKeys("123"+ Keys.ENTER);
        // driver.findElement(By.className("bxhtmled-quote")).sendKeys("123"+ Keys.ENTER);
        // driver.findElement(By.cssSelector("body[class='bxhtmled-quote']")).sendKeys("123"+ Keys.ENTER);
        // driver.findElement(By.xpath("/html/body/blockquote")).sendKeys("123"+ Keys.ENTER);
        // driver.findElement(By.xpath("/html/body/blockquote"));
        // driver.findElement(By.cssSelector("body > blockquote")).sendKeys("123");
        // driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("123"+ Keys.ENTER);
        // driver.findElements(By.tagName("blockquote"));






    }
}
