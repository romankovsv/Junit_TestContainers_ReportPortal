package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5, 1000);
    }

    public HomePage open() {
        driver.get("https://www.testproject.io");
        wait.until(ExpectedConditions.urlContains("testproject.io"));
        return new HomePage(driver);
    }
}
