package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.HomeLoanCalculator;
import testBase.BaseClass;

public class HomeLoanTest extends BaseClass{

	@Test(priority=1,groups = {"smoke","regression"})
	public void Test2_001() throws InterruptedException {
		HomeLoanCalculator HC = new HomeLoanCalculator(driver);
		HC.calculator1();
		HC.homeLoancalculator();
	}
	@Test(priority=2,groups = {"regression"})
	public void Test2_002() throws IOException {
		HomeLoanCalculator HC = new HomeLoanCalculator(driver);
		HC.homevalue();
		HC.downPayment();
		HC.homeloaninsuranceamount();	
	}
	@Test(priority=3,groups = {"regression"})
	public void Test2_003() throws IOException
	{
		HomeLoanCalculator HC = new HomeLoanCalculator(driver);
		HC.homeloanamount();
		HC.homeloaninterest();
		HC.homeloanterm();	
	}
	@Test(priority=4,groups = {"regression"})
	public void Test2_004() throws IOException
	{
		HomeLoanCalculator HC = new HomeLoanCalculator(driver);
		HC.loanfees();
		HC.startmonthyear();
		HC.month();
	}
	@Test(priority=5,groups = {"regression"})
	public void Test2_005() throws InterruptedException, IOException {
		HomeLoanCalculator HC = new HomeLoanCalculator(driver);
		HC.onetimeexpenses();
		HC.propertytaxes();
		HC.homeinsurance();
		HC.maintenanceexpenses();
	}
	@Test(priority=6,groups = {"regression"})
	public void Test2_006() throws IOException {
		HomeLoanCalculator HC = new HomeLoanCalculator(driver);
		HC.scroll();
		HC.yeartable();
	}

}
