Feature: Netmeds medicine search and navigation

  Scenario: Select medicine for fever
    Given I am logged in to the Netmeds website
    When I click on "Medicines" and navigate to "All Medicines"
    And I search for "fever"
    And I select "Pacimol 120mg Suspension 60ml"
    Then I should be navigated to the Pacimol product page