package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class P06_LocateElementById {

    public static void main(String[] args) throws InterruptedException {


        //set up chrome an create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to yahoo.com
        driver.get("https://www.yahoo.com");

        // identify and save the element
        WebElement inputBox = driver.findElement(By.id("ybar-sbq"));

        // enter text hello
        inputBox.sendKeys("Hello");

        // click on the search button
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        searchBtn.click();

        Thread.sleep(2000);

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

         driver.quit();

    }
}
