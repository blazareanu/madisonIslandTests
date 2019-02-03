package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SearchTest {

    // test pentru cautare dupa keyword
    // metoda devine executabila daca adnotam @Test

    @Test
    public void searchByOneKeywordTest() {
        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

//cum gasit un element din site
// driver.findElement (By.id("search")).sendKeys("vase" + Keys.ENTER);
        // driver.findElement(By.className("input-text")).sendKeys("vase" +Keys.ENTER);


        //driver.findElement(By.className("button")).click();
        //driver.findElement(By.className("button")).sendKeys("vase" + Keys.ENTER );
       // driver.findElement(By.name("q")).click();
       // driver.findElement(By.tagName("submit")).click();

       // driver.findElement(By.linkText("href=\"https://fasttrackit.org/selenium-test/women.html\" class=\"level0 has-children\">Women")).click();
        driver.findElement(By.partialLinkText("OMEN")).click();

    }
}
