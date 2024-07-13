package EX_11072024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab001 {
@Test
public void vwoLogin() {

    EdgeDriver driver = new EdgeDriver();
    driver.get("https://sdet.live");
    driver.quit();

}
}