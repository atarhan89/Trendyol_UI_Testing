package com.trendyol.utilities;

import com.trendyol.pages.LoginPage;
import com.trendyol.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.trendyol.driver.Driver.getDriver;

public class PageObjectUtil {

    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static WebDriverWait wait;
    static public Actions actions;




    public static void initializeObjects(){


        loginPage =new LoginPage();
        mainPage=new MainPage();
        wait=new WebDriverWait(getDriver(), Duration.ofSeconds(5));
       actions=new Actions(getDriver());


    }
}
