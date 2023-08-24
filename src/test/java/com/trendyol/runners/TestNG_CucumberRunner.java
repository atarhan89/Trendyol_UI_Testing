package com.trendyol.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions
        (
                plugin = {"pretty",
                        "json:target/cucumber-testng-report/cucumber.json",
                        "html:target/cucumber-testng-report/cucumber.html",
                        "pretty:target/cucumber-testng-report/cucumber-pretty.txt",
                        "usage:target/cucumber-testng-report/cucumber-usage.json"
                },
                features = "src/test/resources/features/",
                glue = {"com/trendyol/stepdefinitions","com/trendyol/hooks"},
                //      tags = "@US01_Negative or @US01_Positive",
                dryRun = false,
                //publish = true,
                monochrome = false,
                snippets = CAMELCASE
        )
public class TestNG_CucumberRunner extends AbstractTestNGCucumberTests {
}