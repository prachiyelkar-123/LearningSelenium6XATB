package EX_13072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab006 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
