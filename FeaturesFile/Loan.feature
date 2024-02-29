Feature: Interest Rate for the Current Year using EmiCalculator

  @regression
  Scenario: UI Validation
    Given user should navigate to the LoanCalculator
    Then user should perform UI validation for all the textBoxes and slider for EmiCalculator
    And user should perform UI validation for all textboxes and slider for LoanAmount Calculator
    And user should perform UI validation for all textboxes and slider for LoanTenure Calculator
