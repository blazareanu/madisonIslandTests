package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    @Test

    public void addToCartFromSearchResultsTest() {

        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test");

        String keyword = "vase";

        String productName = "MODERN MURRAY CERAMIC VASE";
        // img link= https



        //String findElem. click pe black

             // getAtrribute("src")

          //  asertThat src..equals(img_link)

                //li[@class= item last


        //colega

      //  driver.findElement(By.className("input-text"))
      //  driver.findElement(By.className("option-black")).click();
      //  Thread.sleep(100000);

      //  String src= driver.findElement(By.xpath("//li[@class'item last']//img[@class='product-info"))




//
      //  assertThat("IS not the same image", image, src.equals(img_link));

        //colega


//de la mine

        driver.findElement(By.xpath(
                "//div[@class='product-info'] //a[@title='black']")).click();


        //String successMessage = driver.findElement(By.xpath(
        //   "//div[@class='product-info'] //a[@title='black']")).getAttribute('//img[@id="top"]');

        //validarea finala

        // assertThat("Product not displayed in cart  ", productName, CoreMatchers);


//productName,not(is(newPrice));
    }



//String oldPrice = ("//li[@class"item last"")

//        String inpART=newOld
//
  //              double.  =Double.parseDouble(intPartSpecialPrice)

  //  lessThan (value)



    //hamcrest all maven

}

