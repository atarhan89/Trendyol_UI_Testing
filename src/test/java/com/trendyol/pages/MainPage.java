package com.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage {

    @FindBy(xpath = "//div[@class='link account-user']")
    public WebElement girisYapButonu;

    @FindBy(xpath="//div[@class='modal-close']")
    public WebElement popup;

    @FindBy(xpath = "//p[contains(text(),'Hesabım')]")
    public WebElement hesabim;

    @FindBy(xpath = "//p[@class='user-name']")
    public WebElement username;

    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement girisYapLinkText;

}
