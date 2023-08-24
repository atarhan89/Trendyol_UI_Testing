package com.trendyol.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {
    private WebDriver driver;
    public static Actions actions;

    public ActionsUtil(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }



    public static void waitAndClick(WebElement webElement, int milliseconds) {
        actions.pause(milliseconds).click(webElement).perform();
    }

    public static void waitAndEnterText(WebElement element, int milliseconds, String text) {
        actions.pause(milliseconds).moveToElement(element).sendKeys(text).perform();
    }

    public ActionsUtil pause(int milliseconds) {
        actions.pause(milliseconds);
        return this;
    }

    public ActionsUtil click(WebElement element) {
        actions.click(element);
        return this;
    }

    public void perform() {
        actions.perform();
    }

    public static void moveToElement (WebElement element){

        actions.moveToElement(element).perform();
    }
}
