package tests.homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WildberriesSecondTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.manage().window().maximize();
        driver.get("https://www.wildberries.by");
        driver.findElement(By.xpath("//button[contains(text(), 'Принять')]")).click();
        driver.findElement(By.cssSelector("[aria-label='Главное меню']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Зоотовары')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Аквариумистика')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Декорации')]")).click();
        driver.findElement(By.xpath("//div[@class='filter-more']")).click();
        driver.findElement(By.xpath("//div[@data-id='3214']")).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].value='100';",
                driver.findElement(By.xpath("//div/input[@data-tag='inputMax']")));

        WebElement pebbels = driver.findElement(By.cssSelector("[data-click-key=f125594] .filter__fold"));
        new Actions(driver)
                .scrollToElement(pebbels)
                .perform();
        driver.findElement(By.xpath("//div[@data-id='125595']")).click();
        WebElement pack = driver.findElement(By.cssSelector("[data-click-key=f85571] .filter__fold"));
        new Actions(driver)
                .scrollToElement(pack)
                .perform();
        driver.findElement(By.xpath("//div[@data-id='129699']")).click();
        driver.findElement(By.xpath("//button[@class='filters-sidebar__close']")).click();

        String totalGoodsAfterFiltering = driver.findElement(By.cssSelector(".total-goods")).getText();
        System.out.println("Total goods after filtering: " + totalGoodsAfterFiltering);

        driver.findElement(By.xpath("//div[@class='chip chip--reset-button']")).click();

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='chip chip--reset-button']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String totalGoods = driver.findElement(By.cssSelector(".total-goods")).getText();

        System.out.println("Initial quantity of goods: " + totalGoods);
        System.out.println("Final quantity of goods: " + totalGoodsAfterFiltering);
        driver.close();
        driver.quit();
    }
}
