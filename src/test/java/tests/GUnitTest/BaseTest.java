package tests.GUnitTest;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void initDriver() {
        driver = Driver.getWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

}
