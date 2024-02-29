package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.CarLoan;
import factory.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarLoanSteps {
	WebDriver driver;
	CarLoan car;
	
	@Given("user should navigate to the HomePage")
	public void user_should_navigate_to_the_home_page() throws InterruptedException {
	  car=new CarLoan (Baseclass.getDriver());
		car.carloan();
	}

	@When("user should enter loan Amount ,interest rate and loan Tenure")
	public void user_should_enter_loan_amount_interest_rate_and_loan_tenure() throws InterruptedException {
		car.carLoanAmountSlider();
		car.interestSlider();
		car.tensureSlider();
	    
	}

	@Then("user should find the Emi for one Year")
	public void user_should_find_the_emi_for_one_year() {
	   car.loanEmi();
	   car.monButton();
	   car.textBox();
	}

	@Then("user should display the principal  and Interest amount for one month")
	public void user_should_display_the_principal_and_interest_amount_for_one_month() {
		car.principalamount();
	    
	}




}
