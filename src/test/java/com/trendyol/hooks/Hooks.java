package com.trendyol.hooks;

import Logger.Logger;
import com.trendyol.utilities.PageObjectUtil;
import io.cucumber.java.*;

public class Hooks {

    @BeforeAll
    public static void beforeAll() {
        Logger.startLog("Test Started");
    }

    @Before
    public void beforeScenario(Scenario scenario) {

        PageObjectUtil.initializeObjects();
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("beforeStep");
    }



    @AfterStep
    public void afterStep() {
        System.out.println("afterStep");
    }

    @After
    public void afterScenario() {
        System.out.println("afterScenario");
    }


    @AfterAll
    public static void AfterAll() {
      Logger.endLog("Test Finished");
    }

}
