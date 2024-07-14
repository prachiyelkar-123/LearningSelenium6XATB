package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab012 {
    @Test
    public void testvwoLogin() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("http://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");


        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonsubmit = driver.findElement(By.id("js-login-btn"));
        buttonsubmit.click();

        WebElement error = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error.getText(),"Your email, password, IP address or location did not match");

        WebElement freeTriallink = driver.findElement(By.linkText("Start a free trial"));
        freeTriallink.click();


        Thread.sleep(5000);
        driver.quit();

    }


}
