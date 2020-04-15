package com.automationpractice.step_definitions;

import com.automationpractice.pages.SignInPage;
import com.automationpractice.utilities.BrowserUtils;
import com.automationpractice.utilities.ConfigurationReader;
import com.automationpractice.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SignInStepDefinitions {

    SignInPage signInPage = new SignInPage();

    @Given("user is on the main page and verify that page title is {string}")
    public void user_is_on_the_main_page_and_verify_that_page_title_is(String string) {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(string, Driver.get().getTitle());
    }

    @Then("user click the SignIn button")
    public void user_click_the_button() {
        signInPage.signInButton();
    }

    @Then("user verifies that {string} page subtitle is displayed on Login page")
    public void user_verifies_that_page_subtitle_is_displayed_on_Login_page(String string) {
        BrowserUtils.waitForClickablility(signInPage.clickabilitySignIn, 4);
        Assert.assertEquals(string, signInPage.subTitle1());
        System.out.println(signInPage.subTitle1());
    }

    @Then("user enters {string} username and  {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        signInPage.login(string,string2);
    }

    @Then("user enters credentials")
    public void user_enters_credentials() {
        signInPage.login();
    }

    @Then("user verifies that {string} page subtitle is displayed on My Account page")
    public void user_verifies_that_page_subtitle_is_displayed_on_My_Account_page(String string) {
        Assert.assertEquals(string, signInPage.subTitle2());
        System.out.println(signInPage.subTitle2());


    }

}