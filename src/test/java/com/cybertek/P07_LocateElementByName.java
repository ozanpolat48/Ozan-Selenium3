package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P07_LocateElementByName {

    public static void main(String[] args) throws InterruptedException {


        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to google.com
        driver.get("https://www.google.com");

        //identify and save the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        //enter text selenium
        searchBox.sendKeys("Selenium");

        Thread.sleep(2000);

        //click on the serarch button
        WebElement searchBtn = driver.findElement(By.name("btnK"));
        searchBtn.submit();


        //close the browser
        driver.quit();


    }
}
