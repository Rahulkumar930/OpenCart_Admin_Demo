package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}