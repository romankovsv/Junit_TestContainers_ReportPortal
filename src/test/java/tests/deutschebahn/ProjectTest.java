package tests.deutschebahn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import tests.base.BaseTest;

import java.util.Stack;


public class ProjectTest extends BaseTest {



    @Tag("smoke")
    @DisplayName("Check contact page")
    @Test
    public void checkContactPage(){
        System.out.println("Test 1 is running");

        new BasePage(getDriver())
                .open()
                .verifyThatTitleIs("Free!!! Test Automation For All | TestProject");

    }


    @Tag("smoke")
    @DisplayName("Check contact page second test")
    @Test
    public void checkContactPageSecond(){
        System.out.println("Test 2 is running");


        new BasePage(getDriver())
                .open()
                .verifyThatTitleIs("Free Test!!! Automation For All | TestProject");

    }

}
