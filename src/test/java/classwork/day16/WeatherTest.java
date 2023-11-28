package classwork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherTest {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
        driver.get("https://google.com");

        //      String pageTitle = driver.getTitle();
        //      System.out.println("Page title: " + pageTitle);
        //      String currentUrl = driver.getCurrentUrl();
        //      System.out.println("Page Current URL: " + currentUrl);
        //      driver.quit();

        driver.findElement(By.name("q")).sendKeys("Погода минск");
        Thread.sleep(500);
        driver.findElement(By.xpath("//ul[@role ='listbox']/li[1]")).click();
        WebElement widget = driver.findElement(By.xpath("//div[@class='wob_df'][1]"));
        widget.click();
        driver.findElement(By.xpath("//*[contains@aria-label,'Celsius Tuesday 12:00"));
    }
}
