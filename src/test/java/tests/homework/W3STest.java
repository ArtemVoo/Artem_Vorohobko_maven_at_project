package tests.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class W3STest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/java/");

        Actions make = new Actions(driver);
        WebElement tutorialWord = driver.findElement(By.xpath("//span[@class='color_h1']"));
        make
                .doubleClick(tutorialWord)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();

        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.name("q"));
        make
                .click(searchField)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .build()
                .perform();
    }

}
