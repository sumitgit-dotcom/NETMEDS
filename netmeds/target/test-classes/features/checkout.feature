Feature: Update cart and proceed to checkout

  Scenario: Update quantity to 4 and proceed to checkout
    Given I navigate to the cart page
    Then I should see the product name and price in the cart
    And I update the product quantity to 4 in the dropdown
    When I click on the proceed button
    Then I should be redirected to the checkout page