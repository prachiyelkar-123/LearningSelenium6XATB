package EX_13072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab008 {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://sdet.live");
        Thread.sleep(3000);
        driver.quit();

    }

}
