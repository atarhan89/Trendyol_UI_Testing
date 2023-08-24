package com.trendyol.utilities;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserSettingsUtil {
    public static ChromeOptions chromeSettings()
    {
        ChromeOptions option1=new ChromeOptions();

        option1.addArguments(
                "--start-maximized",
                "--disable-notifications",
                "--remote-allow-origins=*"
        );


        option1.setExperimentalOption("excludeSwitches", new String[]{"disable-popup-blocking","enable-automation"});


        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        option1.setExperimentalOption("prefs", prefs);

        return option1;
    }
}