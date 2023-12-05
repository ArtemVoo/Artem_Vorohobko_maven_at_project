package tests.classwork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class WeatherTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Погода минск");
        driver.findElement(By.xpath("//ul[@role ='listbox']/li[1]")).click();
        driver.findElement(By.xpath("//div[@class='wob_df'][1]")).click();
        LocalDate nextDay = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("ru"));
        String nextDayOfWeek = nextDay.format(formatter);
        String x = String.format("//*[contains(@aria-label,'Celsius %s 12:00')]", nextDayOfWeek);
        WebElement element
                = driver.findElement(By.xpath(x));
        String[] temperature = element.getAttribute("aria-label").split("°");
        System.out.println("Weather for tomorrow at 12:00 :" + temperature[0]);
        driver.close();
        driver.quit();
    }
}
