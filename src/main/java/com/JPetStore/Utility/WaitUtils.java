package com.JPetStore.Utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//This class we created to not repeat the wait elements everywhere by using this type our code will be clean and not messy..

public class WaitUtils {
/**
 * This is note for the full project
 * 
 * “Add waits where failure probability exists, not blindly everywhere.”
 */
    private WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
