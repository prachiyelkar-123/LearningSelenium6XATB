package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiniProject2 {
    @Test
    public void Project2(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement appointmentBtn = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        System.out.println("Appointment button text is: "+appointmentBtn.getText());
        Assert.assertEquals(appointmentBtn.getText(),"Make Appointment");
        appointmentBtn.click();

        WebElement enterUserName = driver.findElement(By.id("txt-username"));
        enterUserName.sendKeys("Prachi Yelkar");


        WebElement passwordInputBox = driver.findElement(By.id("txt-password"));
        passwordInputBox.sendKeys("Prachi@123");

        WebElement buttonLogin = driver.findElement(By.id("btn-login"));
        buttonLogin.click();




    }
}
