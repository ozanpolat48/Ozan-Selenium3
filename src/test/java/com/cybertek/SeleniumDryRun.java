package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        // 1.set up chrome driver
        WebDriverManager.chromedriver().setup();
        //2.Create WebDriver instance that point to chrome driver
        WebDriver driver = new ChromeDriver();
        //3.Navigate to https://google.com
        driver.navigate().to("https://google.com");


    }
}
