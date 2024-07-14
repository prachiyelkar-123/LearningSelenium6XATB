package EX_13072024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab010 {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--guest");

        EdgeDriver driver = new EdgeDriver(options);
        driver.get("http://google.com");
        driver.manage().window().minimize();
        driver.quit();
    }
}