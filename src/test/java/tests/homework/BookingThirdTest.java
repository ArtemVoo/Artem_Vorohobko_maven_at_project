package tests.homework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class BookingThirdTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']"))
                .click();

        WebElement currency = driver.findElement(By.cssSelector("[data-testid='header-currency-picker-trigger']"));
        Actions action = new Actions(driver);
        action.moveToElement(currency);
        action.perform();
        String currencyTooltip = driver.findElement(By.xpath("//div[contains(text(),'Выберите валюту')]")).getText();
        Assert.assertEquals("Error message", "Выберите валюту", currencyTooltip);

        WebElement language = driver.findElement(By.cssSelector("[data-testid='header-language-picker-trigger']"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(language);
        action2.perform();
        String languageTooltip = driver.findElement(By.xpath("//div[contains(text(),'Выберите язык')]")).getText();
        Assert.assertEquals("Error message", "Выберите язык", languageTooltip);

        driver.close();
        driver.quit();
    }
}
