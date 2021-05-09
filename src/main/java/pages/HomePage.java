package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public HomePage verifyThatTitleIs(final String expectedTitle){
        Assertions.assertEquals(driver.getTitle(),expectedTitle);
        return this;
    }
}
