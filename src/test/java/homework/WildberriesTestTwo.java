package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class WildberriesTestTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.get("https://www.wildberries.by");
        driver.findElement(By.xpath("//button[contains(text(), 'Принять')]")).click();
        driver.findElement(By.cssSelector("[aria-label='Главное меню']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Зоотовары')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Аквариумистика')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Декорации')]")).click();
        String totalGoods = driver.findElement(By.cssSelector(".total-goods")).getText();
        driver.findElement(By.xpath("//div[@class='filter-more']")).click();
        driver.findElement(By.xpath("//div[@data-id='3214']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@data-tag='inputMax']"));
        element.clear();
        element.sendKeys("100");
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
        System.out.print("Initial quantity of goods: " + totalGoods);
        System.out.print("Final quantity of goods: " + totalGoodsAfterFiltering);
        driver.close();
        driver.quit();
    }
}
