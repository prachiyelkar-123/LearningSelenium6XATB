package EX_18072024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Lab017 {
    EdgeDriver driver;

    @BeforeTest
    public void OPenBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

  @Test
    @Description


    public void CSSExample() throws InterruptedException {

        driver.get("https://www.ebay.com/");
        System.out.println(driver.getTitle());

        driver.manage().window().maximize();

        WebElement SearchBox = driver.findElement(By.cssSelector("input[id=\"gh-ac\"]"));
        SearchBox.sendKeys("Acer");
        WebElement searchButton = driver.findElement(By.cssSelector("input[class= \"btn btn-prim gh-spr\"]"));
        searchButton.click();

        Thread.sleep(3000);

        List<WebElement> SearchTitle = driver.findElements(By.cssSelector(".s-item__title"));
      List<WebElement> SearchTitlePrices = driver.findElements(By.cssSelector(".s-item__price"));
        for (WebElement title : SearchTitle) {
            System.out.println(title.getText());
        }

      for (WebElement price : SearchTitlePrices) {
          System.out.println(price.getText());
      }

      int size = Math.min(SearchTitle.size(),SearchTitlePrices.size());
      for (int i = 0; i < size; i++) {
          System.out.println("Title: " + SearchTitle.get(i).getText() + " || " + "Price: " + SearchTitlePrices.get(i).getText());
          System.out.println();
      }


    }

    @AfterTest

    public void closeBrowser() throws InterruptedException {
try {
    Thread.sleep(5000);
        driver.quit();
    } catch (InterruptedException e) {
    throw new RuntimeException(e);
}

    }
}
