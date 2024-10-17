Feature: Add Pacimol 120mg Suspension 60ml to Cart

  Scenario: Add product to cart, verify cart, and navigate to cart page
    Given I navigate to "https://www.netmeds.com/prescriptions/pacimol-120mg-suspension-60ml"
    When I add the product to the cart
    Then I should navigate to the home page
    And the cart icon should display the product with the correct quantity
    When I click on the cart icon
    Then I should be redirected to the cart page
