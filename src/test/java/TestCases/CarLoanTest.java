package TestCases;
import org.testng.annotations.Test;
import PageObject.CarLoan;
import testBase.BaseClass;
public class CarLoanTest extends BaseClass{

	
	@Test(priority=1,groups = {"smoke","regression"})
	public void Test1_001() throws InterruptedException {
		CarLoan CL = new CarLoan(driver);
		CL.carloan();
		CL.carLoanAmountSlider();
	}
	
	@Test(priority=2,groups = {"regression"})
	public void Test1_002()
	{
		CarLoan CL = new CarLoan(driver);
		CL.interestSlider();
		CL.tensureSlider();
	}
	@Test(priority=3,groups = {"regression"})
	public void Test1_003() {
		CarLoan CL = new CarLoan(driver);
		CL.loanEmi();
		CL.monButton();
		CL.textBox();
	}
	@Test(priority=4,groups = {"regression"})
	public void Test1_004()
	{
		CarLoan CL = new CarLoan(driver);
		CL.principalamount();
	}
}
	
	

	


