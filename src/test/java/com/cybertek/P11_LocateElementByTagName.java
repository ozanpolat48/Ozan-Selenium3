package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocateElementByTagName {

    public static void main(String[] args) {


        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to https://practice.cybertekschool.com
        driver.get("https://practice.cybertekschool.com");

        // identify and save the first element with <a> tag


        // print out text


        // identify and save all the elements with <a> tag


        // click on the link


        // close the browser
    }
}
