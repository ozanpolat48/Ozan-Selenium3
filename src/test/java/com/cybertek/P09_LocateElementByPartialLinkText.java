package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_LocateElementByPartialLinkText {

    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to etsy.com
        driver.get("https://www.etsy.com");

        // identify and save the link element on the top middle section
        WebElement giftLink = driver.findElement(By.partialLinkText(""));


        // click on the link
        giftLink.click();

        // close the browser
        driver.quit();
    }
}
