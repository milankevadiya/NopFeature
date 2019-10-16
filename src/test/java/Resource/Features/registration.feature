@register @ecommerce
Feature: As a user i want to register so that i can use my account facilities
  Scenario: User should be able to register successfully
    Given Go to Registration page
    When Enter all registration details
    Then user should be register successfully
