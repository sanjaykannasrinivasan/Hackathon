Feature: Interest Rate for the Current Year using EmiCalculator

  @regression
  Scenario: Calculating Emi for a Car Loan
    Given user should navigate to the HomePage
    When user should enter loan Amount ,interest rate and loan Tenure
    Then user should find the Emi for one Year
    And user should display the principal  and Interest amount for one month
