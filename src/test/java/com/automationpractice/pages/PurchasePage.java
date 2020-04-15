package com.automationpractice.pages;

import com.automationpractice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement tshirtsButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    public WebElement tshirtSubTitle;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li")
    public WebElement moveToTshirtPanel;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
    public WebElement addToCart;

    @FindBy(xpath = "//h2[contains(., 'Product successfully added to your shopping cart')]")
    public WebElement productSuccesfullyAdded;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement proceedCheckoutButton1;

    @FindBy(xpath = "//*[@id=\"cart_title\"]")
    public WebElement cartSummarySubTitle;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement proceedCheckoutButton2;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/div/div[1]/div[1]/p/label")
    public WebElement deliveryAddressSubTitle;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    public WebElement proceedCheckoutButton3;

    @FindBy(xpath = "//*[@id=\"uniform-cgv\"]")
    public WebElement serviceAgreementCheckBox;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    public WebElement proceedCheckoutButton4;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")
    public WebElement payByBankButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/div/p[1]/strong")
    public WebElement bankPaymentSubTitle;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    public WebElement confirmButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    public WebElement processCompletionSubTitle;






    public PurchasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void tshirtsButton() {
        tshirtsButton.click();
    }

    public String tshirtSubTitle() {

        return tshirtSubTitle.getText();
    }

    public void addToCart() {
        addToCart.click();
    }

    public String productSuccesfullyAdded() {
        return productSuccesfullyAdded.getText();
    }

    public void proceedCheckoutButton1() {
        proceedCheckoutButton1.click();
    }

    public String cartSummarySubTitle() {
        String str = cartSummarySubTitle.getText();
        str = str.substring(0, 21);
        return str;
    }

    public void proceedCheckoutButton2() {
        proceedCheckoutButton2.click();
    }

    public String deliveryAddressSubTitle() {
        return deliveryAddressSubTitle.getText();

    }
    public void proceedCheckoutButton3() {
        proceedCheckoutButton3.click();
    }
    public void serviceAgreementCheckBox() {
        serviceAgreementCheckBox.click();
    }
    public void proceedCheckoutButton4() {
        proceedCheckoutButton4.click();
    }
    public void payByBankButton() {
        payByBankButton.click();
    }

    public String bankPaymentSubTitle() {
        return bankPaymentSubTitle.getText();
    }

    public void confirmButton() {
        confirmButton.click();
    }
    public String processCompletionSubTitle() {
        return processCompletionSubTitle.getText();
    }

}