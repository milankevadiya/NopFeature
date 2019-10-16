
@checkout @ecommerce
Feature: As a User i want to Checkout so that purchase items Successfully
    Scenario: User should be able to add product to Cart
      Given User should be Registered successfully
      And User should be on Book category page
      When click on any product's Add to cart button for add product
      And click on checkout button
      Then User is able to buy product succesfully


