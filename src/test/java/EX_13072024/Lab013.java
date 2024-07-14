package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab013 {
@Test
public void testvwo() throws InterruptedException {

    EdgeOptions edgeOptions = new EdgeOptions();
    edgeOptions.addArguments("--guest");

    WebDriver driver = new EdgeDriver(edgeOptions);
    driver.get("http://app.vwo.com");
    System.out.println(driver.getTitle());
    Assert.assertEquals(driver.getTitle(),"login - VWO");
    Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

    WebElement freeTriallink = driver.findElement(By.linkText("Start a free trial"));
    freeTriallink.click();


    WebElement enteremail = driver.findElement(By.id("page-v1-step1-email"));
    enteremail.sendKeys("admin@admin.com");

    WebElement gdprConsentCheckbox = driver.findElement(By.name("gdpr_consent_checkbox"));
    gdprConsentCheckbox.click();

    List<WebElement> buttonList = driver.findElements(By.tagName("button"));
    buttonList.get(0).click();


    Thread.sleep(5000);
    driver.quit();

}


}

