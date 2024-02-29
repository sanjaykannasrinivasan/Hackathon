Feature: Interest Rate for the Current Year using EmiCalculator

  @regression @sanity
  Scenario: Calculating Emi for HomeLoan and display the data in the excel
    Given user should navigate to the HomeLoan EMI Calculator Page
    When user should enter the relevant details
    And user should store the datas in the Excel sheet
