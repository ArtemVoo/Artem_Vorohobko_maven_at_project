package classwork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;


public class WeatherTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
        driver.get("https://google.com");

        //      String pageTitle = driver.getTitle();
        //      System.out.println("Page title: " + pageTitle);
        //      String currentUrl = driver.getCurrentUrl();
        //      System.out.println("Page Current URL: " + currentUrl);
        //      driver.quit();

        driver.findElement(By.name("q")).sendKeys("Погода минск");
        driver.findElement(By.xpath("//ul[@role ='listbox']/li[1]")).click();
        driver.findElement(By.xpath("//div[@class='wob_df'][1]")).click();
        LocalDate currentDate = LocalDate.now().plusDays(1);
        String dayOfWeek = String.valueOf(currentDate.getDayOfWeek());
        WebElement element
                = driver.findElement(By.xpath("//*[contains(@aria-label,'Celsius суббота 12:00')]"));
        String[] temperature = element.getAttribute("aria-label").split("°");
        System.out.println("Weather for tomorrow at 12:00 :" + temperature[0]);
        driver.close();
        driver.quit();
    }
}
