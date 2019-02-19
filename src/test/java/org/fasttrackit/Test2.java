package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

        @Test

        public void addToCartFromSearchResultsTest() {

            System.setProperty("webdriver.chrome.driver",
                    "src\\test\\resources\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://fasttrackit.org/selenium-test");

            String keyword = "vase";

            String productName = "MODERN MURRAY CERAMIC VASE";

            //String split

            driver.findElement(By.id("search")).sendKeys(keyword + Keys.ENTER);

            driver.findElement(By.xpath(
                    "//p[@class='old-price'] .//id[@title='old-price-437']")).click();


            //productName,not(is(newPrice));

          //  String string = "004-034556";
            // String[] parts = string.split("-");

        }
    }
