Feature: Create vehicles model
  As user I want to be able to add new vehicles

  Scenario: Add vehicle
    Given I login as a "sales manager"
    When I navigate to "Fleet" "Vehicles Model"
    Then user clicks on "Create Vehicles Model"
    And user adds vehicles information
      | Model Name | Make   | Fuel Type |
      | Camry      | Toyota | Gasoline  |
    Then user verifies that vehicles information has been saved
      | Model Name | Make   | Fuel Type |
      | Camry      | Toyota | Gasoline  |