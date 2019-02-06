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

public class SearchTest {

    // test pentru cautare dupa keyword
    // metoda devine executabila daca adnotam @Test

    @Test
    public void searchByOneKeywordTest() {
        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

        //sa nu punem de 2 ori vase, facem o variabila, sa evitam repetitia

        String keyword = "vase";

        //cum gasit un element din site
        driver.findElement(By.id("search")).sendKeys(keyword + Keys.ENTER);
        // driver.findElement(By.className("input-text")).sendKeys("vase" +Keys.ENTER);


        //driver.findElement(By.className("button")).click();
        // driver.findElement(By.className("button")).sendKeys("vase" + Keys.ENTER );
        // driver.findElement(By.name("q")).click();
        // driver.findElement(By.tagName("submit")).click();

        // driver.findElement(By.linkText("href=\"https://fasttrackit.org/selenium-test/women.html\" class=\"level0 has-children\">Women")).click();
        // driver.findElement(By.partialLinkText("OMEN")).click();
        List<WebElement> productNameContainers =
                driver.findElements(By.cssSelector(".product-name>a"));

        for (WebElement container : productNameContainers) {
            String productName = container.getText();
            //  System.out.println(productName);



            //validarea finala

        assertThat("Some of the product names do not contain the search keyword ", productName, containsString(keyword.toUpperCase()));


        }
    }
}
