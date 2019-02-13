package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class ShoppingCartTestVarMea {

    @Test

    // am copiat totul din SearchTest; partea de cautare a vaselor
    public void addToCartFromSearchResultsTest() {

        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

        //sa nu punem de 2 ori vase, facem o variabila, sa evitam repetitia

        String keyword = "Herald Glass Vase";

        //cum gasit un element din site
        driver.findElement(By.id("search")).sendKeys(keyword + Keys.ENTER);



        // Thread.sleep(); e folosit pt a lasa testul sa astepte o per sa se incarce
        driver.findElement(By.xpath("//div[@class='product-info' and .//a[text()='Herald Glass Vase']]//button[@title='Add to Cart']")).click();

        List<WebElement> productName =
                driver.findElements(By.xpath("//div[@class='product-info' and .//a[text()='Herald Glass Vase']]"));

        for (WebElement container : productName) {
            String product = container.getText();
            //  System.out.println(productName);


            //validarea finala

            assertThat("SProduct not displaied in cart  ", product, containsString(keyword.toUpperCase()));


            // driver.findElement(By.xpath("//div[@class='cart-totals'.//button[@title='Proceed to Checkout']")).click();
            // driver.findElement(By.xpath("//button[@title='Proceed to Checkout'//span='Proceed to Checkout']")).click();
            driver.findElement(By.xpath("//body[@class='chechout-cart-index//button[@title='Proceed to Checkout']")).click();
        }
        //table

    }

}
