package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Automations {

    private static WebDriver driver;
    private static WebDriverWait waits;


    public static void init(WebDriver inputDriver) {
        driver = inputDriver;
        waits = new WebDriverWait(inputDriver, Duration.ofSeconds(10));
    }

    public static void type(By locator, String text) {
        WebElement elem = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        elem.sendKeys(text);
    }

    public static void click(By locator) {
        WebElement elem = waits.until(ExpectedConditions.elementToBeClickable(locator));
        highlight(locator);
        elem.click();
    }

    public static void visit(String url) {
        driver.get(url);
    }

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ignore) {
            // DO NOTHING
        }
    }

    public static WebElement findElement(By locator) {
        WebElement elem = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return elem;
    }

    public static void highlight(By locator) {
        WebElement element = findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
    }


    public static boolean isVisible(By locator) {
        WebElement elem = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        highlight(locator);
        return elem.isDisplayed();
    }
}
