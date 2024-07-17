package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class VWOLoginPage {
    @Test

    public void LoginPageVerify() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/");

        driver.manage().window().maximize();

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("vwo@1secmail.com");


        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("Vwo@1234");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(3000);

        driver.quit();




    }

}
