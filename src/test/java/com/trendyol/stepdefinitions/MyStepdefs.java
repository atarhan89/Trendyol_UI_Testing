package com.trendyol.stepdefinitions;

import Logger.Logger;
import com.trendyol.driver.Driver;
import com.trendyol.utilities.WaitUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import org.openqa.selenium.JavascriptExecutor;
import static com.trendyol.utilities.PageObjectUtil.*;
import static com.trendyol.utilities.WaitUtil.*;
public class MyStepdefs {


    @Given("User on the  {string}")
    public void userOnThe(String arg0) {
        Driver.getDriver().get(arg0);
        waitFor(5);
        Logger.info("User on the  \"https://www.trendyol.com/\"");
    }

    @And("User fill EmailTextBox")
    public void userFillEmailTextBox() {
        waitFor(5);
        loginPage.girisFormuEmailTextBox.sendKeys("tdemailtestdata@gmail.com");

        Logger.info("User fill EmailTextBox");
    }

    @And("User fill PasswordTextBox")
    public void userFillPasswordTextBox() {
        loginPage.girisFormuSifreTextBox.sendKeys("Trendyol123!");

        Logger.info("User fill PasswordTextBox");
    }

    @Then("Verificate Failed login")
    public void verificateFailedLogin() {

    }

    @Then("Verificate Success login")
    public void verificateSuccessLogin() {

        WaitUtil.waitForVisibility(mainPage.hesabim, 5);
        actions.pause(1000).moveToElement(mainPage.hesabim).perform();

        Assert.assertTrue(mainPage.username.getText().equalsIgnoreCase("tdemailtestdata@gmail.com"));

        Driver.closeDriver();


    }

    @Then("Verificate Success Login {string}")
    public void verificateSuccessLogin(String arg1) {
        waitFor(5);
        actions.pause(1000).moveToElement(mainPage.hesabim).perform();

        Assert.assertTrue(mainPage.username.getText().equals(arg1));

        Logger.info("Verificate Success Login \"tdemailtestdata@gmail.com\"");
    }

    @And("Pop-up close")
    public void popUpClose() {
        mainPage.popup.click();
        waitFor(5);
        Logger.info("Pop-up close");
    }

    @When("Click on the Giris yap button")
    public void clickOnTheGirisYapButton() {

        actions.pause(2000).moveToElement(mainPage.girisYapLinkText).perform();

        actions.pause(2000).click(mainPage.girisYapButonu).perform();

        waitFor(7);

        Logger.info("Click on the Giris yap button");

    }

    @And("Submit on the  Giris yap button")
    public void submitOnTheGirisYapButton() {
        loginPage.girisFormuGirisYapButonu.click();
        waitFor(5);
        Logger.info("Submit on the  Giris yap button");
    }


    @Then("Verificate fail Login massage {string}")
    public void verificateFailLoginMassage(String arg3) {
        waitFor(5);

        Assert.assertTrue(WaitUtil.waitForVisibility(loginPage.hataMesaji,5).getText().trim().equalsIgnoreCase(arg3));

        Logger.info("Verificate fail Login massage \"E-posta adresiniz ve/veya şifreniz hatalı.\"");
    }



    @And("User fill  invalid EmailTextBox")
    public void userFillInvalidEmailTextBox() {
        waitFor(5);
       loginPage.girisFormuEmailTextBox.sendKeys("tdemailtestdata@gmail.commm");

       Logger.info("User fill  invalid EmailTextBox");
    }
}
