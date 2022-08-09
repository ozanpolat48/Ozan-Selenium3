package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_GetTagName_GetAttribute_GetText {

    public static void main(String[] args) throws InterruptedException {

        //set up chrome and creeate WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://www.google.com");

        // indentify and save the search box element and enter Selenium
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        // Get tag name of the element
        System.out.println("searchBox.getTagName() = "
                           + searchBox.getTagName());

        // Get value attribute of the element
        System.out.println("searchBox.getAttribute(\"value\") = "
                            + searchBox.getAttribute("value"));

        // identify and save the search button element
        WebElement searchBtn = driver.findElement(By.name("btnK"));


        // Get tag name of the element, get, class attribute
        System.out.println("searchBtn.getTagName() = " + searchBtn.getTagName());
        System.out.println("searchBtn.getAttribute(\"class\") = " + searchBtn.getAttribute("class"));

        // Click on the search button
        //Thread.sleep(2000);
        searchBtn.submit();

        // identify the element that hold search result number
        WebElement searchResult = driver.findElement(By.id("result-stats"));

        // get the text of that element
        String resultText = searchResult.getText();
        System.out.println("resultText = " + resultText);




        // benim örnek geliyor şimdi
        driver.quit();

        Thread.sleep(2000);

        //youtube örneği
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();


        driver1.get("https://www.youtube.com");

        WebElement searchBoxx = driver1.findElement(By.name("search_query"));
        searchBoxx.sendKeys("Mithrain");

        System.out.println("searchBoxx.getTagName() = " + searchBoxx.getTagName());
        System.out.println("searchBoxx.getAttribute(\"name\") = " + searchBoxx.getAttribute("name"));

        WebElement searchBtnn = driver1.findElement(By.id("search-icon-legacy"));
        System.out.println("searchBtnn.getTagName() = " + searchBtnn.getTagName());
        System.out.println("searchBtnn.getAttribute(\"id\") = " + searchBtnn.getAttribute("id"));

        Thread.sleep(2000);
        searchBtnn.click();









    }
}
