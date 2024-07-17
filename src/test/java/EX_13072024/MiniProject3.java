package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MiniProject3 {

    @Test

    public void project3(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        driver.manage().window().maximize();

        WebElement emailInputBox = driver.findElement(By.id("username"));
        emailInputBox.sendKeys("augtest_040823@idrive.com");


        WebElement passwordInputBox = driver.findElement(By.id("password"));
        passwordInputBox.sendKeys("123456");

        WebElement buttonSignin = driver.findElement(By.id("frm-btn"));
        buttonSignin.click();






    }

}

