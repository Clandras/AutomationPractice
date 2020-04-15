package com.automationpractice.pages;

import com.automationpractice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//everything that is in common among pages
//can go here
//for example top menu elements don't belong to specific page
//top menu appears on every single page
//so we can keep them here
public class BasePage {


    @FindBy(xpath= "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement signInButton;



    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void mainPage() {

    }

    public void signInButton(){
        signInButton.click();
    }

}