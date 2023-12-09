package pages;

import driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WildberriesPage {
    WebDriver driver = Driver.getWebDriver();

    public static final String ACCEPT_COOKIES = "//button[contains(text(), 'Принять')]";
    public static final String MAIN_MENU = "[aria-label='Главное меню']";
    public static final String FILTER_MORE = "//div[@class='filter-more']";
    public static final String MAX_PRICE = ".filter.filter--price .input:nth-child(2) input";
    public static final String CLOSE_SIDEBAR = "//button[@class='filters-sidebar__close']";
    public static final String RESET_5D_FILTER = "//button[@data-key='fdlvr']";
    public static final String RESET_ALL_FILTERS = "//div[@class='chip chip--reset-button']";
    public static final String COUNT_OF_GOODS = ".total-goods";

    public void acceptCookies() {
        driver.findElement(By.xpath(ACCEPT_COOKIES)).click();
    }

    public void storageBoxSection() {
        driver.findElement(By.cssSelector(MAIN_MENU)).click();
        driver.findElement(By.xpath("//li[@data-ind='4']")).click();
        driver.findElement(By.xpath("//li[@data-id='60624']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Коробки для хранения')]")).click();
    }

    public void storageBoxFilters() {
        driver.findElement(By.xpath(FILTER_MORE)).click();
        driver.findElement(By.xpath("//span[contains(text(), 'до 5 дней')]")).click();
        driver.findElement(By.xpath("//div[@data-id='108439']")).click();
    }

    public void boxFilterByPrice() {
        WebElement element = driver.findElement(By.xpath("//div[@class='filter__header'][contains(string(),'Материал изделия')]"));
        new Actions(driver).scrollToElement(element).click();
        WebElement element1 = driver.findElement(By.cssSelector(MAX_PRICE));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='100'", element1);
        driver.findElement(By.xpath(CLOSE_SIDEBAR)).click();
    }

    public void boxClose5DFilter() {
        driver.findElement(By.xpath(RESET_5D_FILTER)).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(RESET_5D_FILTER)));
    }

    public void countAmountOfGoods() {
        String countOfGoods = driver.findElement(By.cssSelector(COUNT_OF_GOODS)).getText();
        System.out.println("Count of goods: " + countOfGoods);
    }
    public void amOfGoodsAfterFilt(){
        String AmOfGoodsAfterFiltering = driver.findElement(By.cssSelector(COUNT_OF_GOODS)).getText();
        System.out.println("Total goods after filtering: " + AmOfGoodsAfterFiltering);
    }

    public void decorationsSection() {
        driver.findElement(By.cssSelector(MAIN_MENU)).click();
        driver.findElement(By.xpath("//li[@data-id='6119']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Аквариумистика')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Декорации')]")).click();
    }

    public void decorationsFilter(){
        driver.findElement(By.xpath(FILTER_MORE)).click();
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
        driver.findElement(By.xpath(CLOSE_SIDEBAR)).click();
    }
    public void resetAllFilters(){
        driver.findElement(By.xpath(RESET_ALL_FILTERS)).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(RESET_ALL_FILTERS)));
    }
    public void wildberriesPage(){
        driver.get("https://www.wildberries.by");
    }
}
