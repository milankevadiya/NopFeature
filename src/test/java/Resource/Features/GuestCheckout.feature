
@guestcheckout @ecommerce
Feature: As a Guest User i want to Checkout so that purchase items Successfully
  Scenario: User should be able to buy product
    Given User should be on Book category page
    When click on any product's Add to cart button for add product
    And click on checkout button for checkout process
    Then User is able to buy product succesfully