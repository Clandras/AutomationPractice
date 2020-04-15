Feature: Purchase
  As user, I should be able to purchase a dress by this web page

  Background:
    Given user is on the main page and verify that page title is "My Store"
    Then user click the SignIn button
    And user verifies that "ALREADY REGISTERED?" page subtitle is displayed on Login page
    Then user enters credentials
    And user verifies that "MY ACCOUNT" page subtitle is displayed on My Account page

  @Purchase
  Scenario: Purchase a dress on account
    Then user clicks the TSHIRTS button
    And user verifies that "Faded Short Sleeve T-shirts" item is on the page
    Then user clicks Ad to cart button
    And user verifies "Product successfully added to your shopping cart" confirmation
    Then user clicks the Proceed to checkout button first
    And user verifies "SHOPPING-CART SUMMARY" subtitle for cart summary
    Then user clicks the Proceed to checkout button second
    And user verifies "Use the delivery address as the billing address." subtitle for delivery address
    Then user clicks the Proceed to checkout button third
    And user click the Terms of service agreement
    Then user clicks the Proceed to checkout button final
    Then user selects the payment method
    And user verifies that "You have chosen to pay by bank wire. Here is a short summary of your order:" subtitle for payment
    Then user clicks I confirm my order button
    And user verifies "Your order on My Store is complete." subtitle for process completion






