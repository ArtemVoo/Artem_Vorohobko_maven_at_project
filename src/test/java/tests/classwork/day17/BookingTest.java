package tests.classwork.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookingTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']"))
                .click();
        driver.findElement(By.name("ss")).sendKeys("Париж");
        driver.findElement(By.xpath("//button[@data-testid='date-display-field-start'] "))
                .click();
        driver.findElement(By.xpath("//div[@class='d4babb55ef']/div[1]//tr[2]/td[3]")).click();
        driver.findElement(By.xpath("//div[@class='d4babb55ef']/div[1]//tr[3]/td[4]")).click();
        driver.findElement(By.xpath("//div[@class='d777d2b248']")).click();
        WebElement guestAmount
                = driver.findElement(By.xpath("//div[@class='aaf77d2184']/div[1]//button[2]"));
        guestAmount.click();
        guestAmount.click();
        driver.findElement(By.xpath("//div[@class='aaf77d2184']/div[3]//button[2]")).click();
        driver.findElement(By.xpath("//div[@class='b067f3afe2 b3c059c742']/button")).click();
        driver.findElement(By.xpath("//div[@class='e22b782521 d12ff5f5bf']/button")).click();
        WebElement fiveStars = driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']"));
        new Actions(driver)
                .scrollToElement(fiveStars)
                .perform();
        driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']"))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='overlay-spinner']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//div[@class='dcf496a7b9 bb2746aad9']//span/button[@data-testid='sorters-dropdown-trigger']"))
                .click();
        driver.findElement(By.xpath("//ul[@class='ad7c39949a']/li[6]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='overlay-spinner']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
}
