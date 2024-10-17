Feature: Validate Netmeds Product Page

  Scenario: Validate attributes of Pacimol 120mg Suspension 60ml product page
    Given I navigate to "https://www.netmeds.com/prescriptions/pacimol-120mg-suspension-60ml"
    When I check the product images
    Then the product images should be displayed correctly

    When I check the product pricing
    Then the product pricing should be accurate and displayed

    When I check the breadcrumb navigation
    Then the breadcrumb path should be correct and clickable

    When I check the product availability and expiry details
    Then the product should show availability and expiry information

    When I add the product to the cart
    Then the product should be added to the cart successfully
