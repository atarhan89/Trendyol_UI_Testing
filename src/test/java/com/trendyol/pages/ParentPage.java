package com.trendyol.pages;

import org.openqa.selenium.support.PageFactory;

import static com.trendyol.driver.Driver.getDriver;

public abstract class ParentPage
{
    public ParentPage()
    {
        PageFactory.initElements(getDriver(),this);
    }
}