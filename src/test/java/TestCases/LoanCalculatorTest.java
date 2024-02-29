package TestCases;

import org.testng.annotations.Test;

import PageObject.LoanCalaulator;
import testBase.BaseClass;

public class LoanCalculatorTest extends BaseClass{
	
	@Test(priority=1,groups = {"smoke","regression"})
	public void Test3_001()
	{
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.calculatorbutton();
		LC.loancalculator();
	}
	
	@Test(priority=2,groups = {"smoke","regression"})
	public void Test3_002()
	{
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.emiamountCheckbox();
		LC.emiamountslider();
	}
	
	@Test(priority=3,groups = {"smoke","regression"})
	public void Test3_003() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.emiInterestCheckbox();
		LC.emiInterestSlider();
	}
	
	@Test(priority=4,groups = {"smoke","regression"})
	public void Test3_004() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.emiInterestCheckbox();
		LC.emiInterestSlider();
	}
	
	@Test(priority=5,groups = {"smoke","regression"})
	public void Test3_005() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.emiTensureCheckbox();
		LC.emiMonth();
		LC.emiTensureScale();
	}

	@Test(priority=6,groups = {"smoke","regression"})
	public void Test3_006() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.feesCheckbox();
		LC.feesslider();
	}
	
	@Test(priority=7,groups = {"smoke","regression"})
	public void Test3_007() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.loanAmountCalculatorPage();
		LC.loanAmountCheckbox();
		LC.loanAmountSlider();
	}
	
	@Test(priority=8,groups = {"smoke","regression"})
	public void Test3_008() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.loanInterestCheckbox();
		LC.loanInterestSlider();
	}
	
	@Test(priority=9,groups = {"smoke","regression"})
	public void Test3_009() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.loanAmountTensurecheckbox();
		LC.loanYear();
		LC.loanAmountTensureScale();
		LC.chargesCheckbox();
		LC.chargesSlider();
	}
	
	@Test(priority=10,groups = {"smoke","regression"})
	public void Test_010() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.loanTensureCalculatorPage();
		LC.loanTensureAmountcheckbox();
		LC.loanTensureAmountSlider();
		LC.loanTensureEmicheckbox();
		LC.loanTensureEmiSlider();
	}
	
	@Test(priority=11,groups = {"smoke","regression"})
	public void Test3_011() {
		LoanCalaulator LC = new LoanCalaulator(driver);
		LC.loanAmountInterestcheckbox();
		LC.loanAmountInterestSlider();
		LC.loanAmountfeesCheckbox();
		LC.loanAmountfeesSlider();
	}
}
