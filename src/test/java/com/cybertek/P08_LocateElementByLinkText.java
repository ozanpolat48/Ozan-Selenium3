package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_LocateElementByLinkText {

    public static void main(String[] args) throws InterruptedException {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to google.com
        driver.get("https://www.google.com");

        // identify and save the about link element on the top
        WebElement aboutLink = driver.findElement(By.linkText("Hakkında"));

        // Click on the link
        aboutLink.click();

        Thread.sleep(5000);

        // identify and save the products link element on the top
        WebElement productsLink = driver.findElement(By.linkText("Ürünler"));
        productsLink.click();


        // close the browser
        //driver.quit();


    }

}
