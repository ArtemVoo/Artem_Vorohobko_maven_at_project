package tests.homework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WildberriesFirstTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.wildberries.by");
        driver.findElement(By.xpath("//button[contains(text(), 'Принять')]")).click();
        driver.findElement(By.xpath("//button[@class='search-component-button search-component-icon-catalog']"))
                .click();
        driver.findElement(By.xpath("//li[@data-ind='4']")).click();
        driver.findElement(By.xpath("//li[@data-id='60624']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Коробки для хранения')]")).click();
        driver.findElement(By.xpath("//div[@class='filter-more']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'до 5 дней')]")).click();
        driver.findElement(By.xpath("//div[@data-id='108439']")).click();
        driver.findElement(By.xpath("//button[@class='filters-sidebar__close']")).click();
        driver.findElement(By.xpath("//div[@data-title='Сортировка']")).click();
        driver.findElement(By.xpath("//button[@data-key='fdlvr']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@data-key='fdlvr']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String countOfGoods = driver.findElement(By.cssSelector(".total-goods")).getText();
        System.out.println("Count of goods: " + countOfGoods);
        driver.close();
        driver.quit();
    }

}
