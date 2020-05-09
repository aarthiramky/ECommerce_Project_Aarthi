
Feature: To add an item to the cart and make payment in BuyBuyBaby website

  Scenario: To sign in to BuyBuyBaby website
    Given User is on the BuyBuyBaby Page
    When User clicks on Sign In
    And User enters email and password
    And User clicks on SignIn button
    Then User navigates to the welcome page

  Scenario: Add an item to the cart
    Given User is on the welcome page
    When User types stroller in Search box
    And User presses enter
    Then User navigates to Search page
    And User clicks on Umbrella Stroller
    And User selects an item and then clicks
    And User selects color and clicks on Ship It button
    And User clicks on View Cart and Checkout Button
    Then User navigates to Order Summary page

  Scenario: User checks out and makes payment
    Given User is on the Order Summary Page
    When User clicks on checkout button
    Then User navigates to Checkout

