package tests.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoQaTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(element);
        select.selectByValue("5");

        WebElement element1 = driver.findElement(By.id("cars"));

        Select select1 = new Select(element1);
        select1.selectByValue("saab");

    }
}
