package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.LoanCalaulator;
import factory.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoanCalculator {
	
	WebDriver driver;
	LoanCalaulator Loan;
	
	@Given("user should navigate to the LoanCalculator")
	public void user_should_navigate_to_the_loan_calculator() {
		Loan = new LoanCalaulator(Baseclass.getDriver());
		Loan.calculatorbutton();
		Loan.loancalculator();
	}

	@Then("user should perform UI validation for all the textBoxes and slider for EmiCalculator")
	public void user_should_perform_ui_validation_for_all_the_text_boxes_and_slider_for_emi_calculator() {
		Loan.emiamountCheckbox();
		Loan.emiamountslider();
		Loan.emiInterestCheckbox();
		Loan.emiInterestSlider();
		Loan.emiInterestCheckbox();
		Loan.emiInterestSlider();
		Loan.emiTensureCheckbox();
		Loan.emiMonth();
		Loan.emiTensureScale();
		Loan.feesCheckbox();
		Loan.feesslider();
	}

	@Then("user should perform UI validation for all textboxes and slider for LoanAmount Calculator")
	public void user_should_perform_ui_validation_for_all_textboxes_and_slider_for_loan_amount_calculator() {
		Loan.loanAmountCalculatorPage();
		Loan.loanAmountCheckbox();
		Loan.loanAmountSlider();
		Loan.loanInterestCheckbox();
		Loan.loanInterestSlider();
		Loan.loanAmountTensurecheckbox();
		Loan.loanYear();
		Loan.loanAmountTensureScale();
		Loan.chargesCheckbox();
		Loan.chargesSlider();
	}

	@Then("user should perform UI validation for all textboxes and slider for LoanTenure Calculator")
	public void user_should_perform_ui_validation_for_all_textboxes_and_slider_for_loan_tenure_calculator() {
		Loan.loanTensureCalculatorPage();
		Loan.loanTensureAmountcheckbox();
		Loan.loanTensureAmountSlider();
		Loan.loanTensureEmicheckbox();
		Loan.loanTensureEmiSlider();
		Loan.loanAmountInterestcheckbox();
		Loan.loanAmountInterestSlider();
		Loan.loanAmountfeesCheckbox();
		Loan.loanAmountfeesSlider();
	}


}
