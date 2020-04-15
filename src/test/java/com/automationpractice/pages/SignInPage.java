package com.automationpractice.pages;

import com.automationpractice.utilities.ConfigurationReader;
import com.automationpractice.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement clickabilitySignIn;

    @FindBy(xpath = "//*[@id=\"login_form\"]/h3")
    public WebElement subTitle1; //ALREADY REGISTERED?

    @FindBy(css = "input[id='email']")
    public WebElement usernameInput;

    @FindBy(css = "input[id='passwd']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    public WebElement subTitle2; //MY ACCOUNT

    public SignInPage() {

        PageFactory.initElements(Driver.get(), this);
    }
    public String subTitle1(){
        return subTitle1.getText();
    }
    public String subTitle2(){
        return subTitle2.getText();
    }
    public void login() {
        login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

}
