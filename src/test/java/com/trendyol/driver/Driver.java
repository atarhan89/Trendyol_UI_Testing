package com.trendyol.driver;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.trendyol.utilities.BrowserSettingsUtil.chromeSettings;

public class Driver {



    private static WebDriver driver;


    public static WebDriver getDriver(String browser)

    {
        if (driver == null)
        {

            browser = browser == null ? "chrome" : browser;

            switch (browser)
            {
                case "chrome":


                    driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(chromeSettings()).create();
                    break;

                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--start-maximized");
                    URL initialURL=null;
                    try {
                        initialURL=new URL("htpps://www.google.com/");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    driver= new RemoteWebDriver(initialURL,firefoxOptions);

                    ChromeOptions option1=new ChromeOptions();


                    option1.addArguments("--start-maximized","--disable-notifications", "--remote-allow-origins=*");


                    option1.setExperimentalOption("excludeSwitches", new String[]{"disable-popup-blocking","enable-automation"});

                    driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(option1).create();
                    break;

                case "edge":
                    EdgeOptions option3=new EdgeOptions();
                    option3.addArguments("--start-maximized");
                    driver= new EdgeDriver(option3);
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver=new SafariDriver();
                    break;
                case "chrome-headless":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless=new");
                    driver = new ChromeDriver(options);
                    break;

            }
        }

        return driver;
    }


    public static WebDriver getDriverByDefaultBrowser()
    {
        return getDriver(null);
    }


    public static WebDriver getDriver()
    {
        if (driver==null)
        {
            getDriver("chrome");
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}