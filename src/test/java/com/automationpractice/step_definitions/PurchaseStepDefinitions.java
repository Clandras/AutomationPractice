package com.automationpractice.step_definitions;

import com.automationpractice.pages.PurchasePage;
import com.automationpractice.utilities.BrowserUtils;
import com.automationpractice.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class PurchaseStepDefinitions {

    PurchasePage purchasePage = new PurchasePage();

    @Then("user clicks the TSHIRTS button")
    public void user_clicks_the_TSHIRTS_button() {
        BrowserUtils.waitForClickablility(purchasePage.tshirtsButton, 4);
        purchasePage.tshirtsButton();
    }
    @Then("user verifies that {string} item is on the page")
    public void user_verifies_that_item_is_on_the_page(String string) {
        BrowserUtils.waitForClickablility(purchasePage.tshirtSubTitle, 4);
        Assert.assertEquals(string, purchasePage.tshirtSubTitle());
        System.out.println(purchasePage.tshirtSubTitle());
    }
    @Then("user clicks Ad to cart button")
    public void user_clicks_Ad_to_cart_button() {
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Actions action = new Actions(Driver.get());
        action.moveToElement(purchasePage.moveToTshirtPanel).build().perform();
        BrowserUtils.waitForClickablility(purchasePage.addToCart,4);
        purchasePage.addToCart();

    }
    @Then("user verifies {string} confirmation")
    public void user_verifies_confirmation(String string) {
        BrowserUtils.waitForVisibility(purchasePage.productSuccesfullyAdded, 4);
        Assert.assertEquals(string,purchasePage.productSuccesfullyAdded());
        System.out.println(purchasePage.productSuccesfullyAdded());
    }
    @Then("user clicks the Proceed to checkout button first")
    public void user_clicks_the_Proceed_to_checkout_button_first() {
        BrowserUtils.waitForClickablility(purchasePage.proceedCheckoutButton1,4);
        purchasePage.proceedCheckoutButton1();
    }
    @Then("user verifies {string} subtitle for cart summary")
    public void user_verifies_subtitle_for_cart_summary(String string) {
        BrowserUtils.waitForVisibility(purchasePage.cartSummarySubTitle, 4);
        Assert.assertEquals(string,purchasePage.cartSummarySubTitle());
        System.out.println(purchasePage.cartSummarySubTitle());
    }
    @Then("user clicks the Proceed to checkout button second")
    public void user_clicks_the_Proceed_to_checkout_button_second() {
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        BrowserUtils.waitForClickablility(purchasePage.proceedCheckoutButton2,4);
        purchasePage.proceedCheckoutButton2();
    }
    @Then("user verifies {string} subtitle for delivery address")
    public void user_verifies_subtitle_for_delivery_address(String string) {
        BrowserUtils.waitForVisibility(purchasePage.deliveryAddressSubTitle, 4);
        Assert.assertEquals(string,purchasePage.deliveryAddressSubTitle());
        System.out.println(purchasePage.deliveryAddressSubTitle());
    }
    @Then("user clicks the Proceed to checkout button third")
    public void user_clicks_the_Proceed_to_checkout_button_third() {
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        BrowserUtils.waitForClickablility(purchasePage.proceedCheckoutButton3,4);
        purchasePage.proceedCheckoutButton3();
    }
    @Then("user click the Terms of service agreement")
    public void user_click_the_Terms_of_service_agreement() {
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        BrowserUtils.waitForClickablility(purchasePage.serviceAgreementCheckBox,4);
        purchasePage.serviceAgreementCheckBox();
    }
    @Then("user clicks the Proceed to checkout button final")
    public void user_clicks_the_Proceed_to_checkout_button_final() {
        BrowserUtils.waitForClickablility(purchasePage.proceedCheckoutButton4,4);
        purchasePage.proceedCheckoutButton4();
    }
    @Then("user selects the payment method")
    public void user_selects_the_payment_method() {
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        BrowserUtils.waitForClickablility(purchasePage.payByBankButton,4);
        purchasePage.payByBankButton();
    }
    @Then("user verifies that {string} subtitle for payment")
    public void user_verifies_that_subtitle_for_payment(String string) {
        BrowserUtils.waitForVisibility(purchasePage.bankPaymentSubTitle, 4);
        Assert.assertEquals(string,purchasePage.bankPaymentSubTitle());
        System.out.println(purchasePage.bankPaymentSubTitle());
    }
    @Then("user clicks I confirm my order button")
    public void user_clicks_I_confirm_my_order_button() {
        BrowserUtils.waitForClickablility(purchasePage.confirmButton,4);
        purchasePage.confirmButton();
    }

    @Then("user verifies {string} subtitle for process completion")
    public void user_verifies_subtitle_for_process_completion(String string) {
        BrowserUtils.waitForVisibility(purchasePage.processCompletionSubTitle, 4);
        Assert.assertEquals(string,purchasePage.processCompletionSubTitle());
        System.out.println(purchasePage.processCompletionSubTitle());
    }

}
