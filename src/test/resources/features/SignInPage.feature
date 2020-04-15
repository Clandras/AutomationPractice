Feature: Login
  As user, I should be able to login into my account.

  @SignIn1
  Scenario: Login as a user by username and password
    Given user is on the main page and verify that page title is "My Store"
    Then user click the SignIn button
    And user verifies that "ALREADY REGISTERED?" page subtitle is displayed on Login page
    Then user enters "gibori7458@provamail.com" username and  "eRnstRoi" password
    And user verifies that "MY ACCOUNT" page subtitle is displayed on My Account page

  @SignIn2
  Scenario: Login as a user by configuration.properties
    Given user is on the main page and verify that page title is "My Store"
    Then user click the SignIn button
    And user verifies that "ALREADY REGISTERED?" page subtitle is displayed on Login page
    Then user enters credentials
    And user verifies that "MY ACCOUNT" page subtitle is displayed on My Account page



