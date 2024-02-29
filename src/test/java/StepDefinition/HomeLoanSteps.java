package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.HomeLoanCalculator;
import factory.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeLoanSteps {

	WebDriver driver;
	HomeLoanCalculator home;
	
	@Given("user should navigate to the HomeLoan EMI Calculator Page")
	public void user_should_navigate_to_the_home_loan_emi_calculator_page() {
		home=new HomeLoanCalculator(Baseclass.getDriver());
		home.calculator1();
		home.homeLoancalculator();
	}

	@When("user should enter the relevant details")
	public void user_should_enter_the_relevant_details() throws IOException {
		home.homevalue();
		home.downPayment();
		home.homeloaninsuranceamount();
		home.homeloanamount();
		home.homeloaninterest();
		home.homeloanterm();	
		home.loanfees();
		home.startmonthyear();
		home.month();
		home.onetimeexpenses();
		home.propertytaxes();
		home.homeinsurance();
		home.maintenanceexpenses();
	}

	@When("user should store the datas in the Excel sheet")
	public void user_should_store_the_datas_in_the_excel_sheet() throws IOException {
		home.scroll();
		home.yeartable();
	}
}
