package tests.homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class BookingSecondTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']"))
                .click();
        driver.findElement(By.name("ss")).sendKeys("London");
        driver.findElement(By.xpath("//*[@data-testid='autocomplete-result']/div/div[text()='London']"))
                .click();
        driver.findElement(By.xpath("//div[@class='e22b782521 d12ff5f5bf']/button")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
                driver.findElement(By.xpath("//*[@data-testid='property-card'][10]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor='green'",
                driver.findElement(By.xpath("//*[@data-testid='property-card'][10]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'",
                driver.findElement(By.xpath("//*[@data-testid='property-card'][10]//descendant::div[@data-testid='title']")));
        byte[] asBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Files.write(Paths.get("BookingScreenshot.png"), asBytes);
        driver.close();
        driver.quit();
    }
}
