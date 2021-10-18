#Author: jihen.thouir@gmail.com
@test-shop-tools
Feature: Test Shop Tools
  As a user I want to choose a new product

  @add-an-item
  Scenario: Test Shop Tools
    Given I want to navigate to https://shop.demoqa.com/
    When I select an item
    And I choose color
    And I choose size
    And I click Add to cart
    Then I validate successfull message

  @view-cart
  Scenario: View cart
    When I click View cart
    Then I validate the addition od the item on the cart
    And I validate the price

  @checkout
  Scenario: Proceed to checkout
    When I click Proceed to checkout
    Then I validate the payment form
    When I print firstname
    And I print lastname
    And I select country
    And I print address
    And I print phone number
    And I print Email
    And I select I HAVE READ AND AGREE TO THE WEBSITE TERMS AND CONDITIONS
    And I click PLACE ORDER
    Then I validate successfull message
    And I validate the commande
