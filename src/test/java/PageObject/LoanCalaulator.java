package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanCalaulator extends BasePage {

	public LoanCalaulator(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@id='menu-item-dropdown-2696']")
	WebElement Calculatorbutton;
	
	@FindBy(xpath = "//a[text()='Loan Calculator']")
	WebElement LoanCalculator;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement EmiamountCheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")
	WebElement EmiamountSlider;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	WebElement Emiinterestcheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]")
	WebElement Emiinterestslider;
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	WebElement EmiTensurecheckbox;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]")
	WebElement EmiTensureScale1;
	
	@FindBy(xpath = "//label[@class='btn btn-secondary']")
	WebElement EmiMonth;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]")
	WebElement EmiTensureScale2;
	
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	WebElement FeesCheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[5]")
	WebElement Feesslider;
	
	@FindBy(xpath = "(//a[@class='hidden-ts'])[2]")
	WebElement LoanAmountCalculatorpage;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement LoanAmountcheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]")
	WebElement LoanAmountSlider;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	WebElement LoanInterestCheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]")
	WebElement LoanInterestSlider;
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	WebElement LoanAmountTensurecheckbox;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]")
	WebElement LoanAmountTensurescale1;
	
	@FindBy(xpath = "(//label[@class='btn btn-secondary'])[1]")
	WebElement LoanYear;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]")
	WebElement LoanAmountTensurescale2;
	
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	WebElement ChargesCheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[5]")
	WebElement ChargesSlider;
	
	@FindBy(xpath = "(//a[@class='hidden-ts'])[3]")
	WebElement LoanTensureCalculatorPage;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement LoanTensureAmountcheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")
	WebElement LoanTensureAmountSlider;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement LoanTensureEmicheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]")
	WebElement LoanTensureEmiSlider;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	WebElement LoanAmountInterestcheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]")
	WebElement LoanAmountInterestSlider;
	
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	WebElement LoanAmountfeesCheckbox;
	
	@FindBy(xpath = "(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[5]")
	WebElement LoanAmountfeesSlider;
	
	
	public void calculatorbutton()
	{
		Calculatorbutton.click();
	}
	
	public void loancalculator()
	{
		LoanCalculator.click();
		System.out.println("************************emiamountPage**********************************");

	}
	
	public void emiamountCheckbox()
	{
		System.out.println("emiamountCheckbox is enabled or not");
		System.out.println(EmiamountCheckbox.isEnabled());
	}
	
	public void emiamountslider()
	{
		System.out.println("emiamountslider is enabled or not");
		System.out.println(EmiamountSlider.isEnabled());

	}
	
	public void emiInterestCheckbox()
	{
		System.out.println("emiInterestCheckbox is enabled or not");
		System.out.println(Emiinterestcheckbox.isEnabled());
	}

	public void emiInterestSlider()
	{
		System.out.println("emiInterestSlider is enabled or not");
		System.out.println(Emiinterestslider.isEnabled());
	}
	
	public void emiTensureCheckbox()
	{
		System.out.println("emiTensureCheckbox is enabled or not");
		System.out.println(EmiTensurecheckbox.isEnabled());
	}
	
	public void emiMonth()
	{
		EmiMonth.click();
	}
	
	public void emiTensureScale()
	{
		String value1 =EmiTensureScale1.getText();
		System.out.println(value1);
		emiMonth();
		String value2 =EmiTensureScale2.getText();
		System.out.println(value2);
		
		if(value1.equals(value2)) {
			System.out.println("Failed");
		} else {
			System.out.println("Passed");
		}
	}
	
	public void feesCheckbox()
	{
		System.out.println("feesCheckbox is enabled or not");
		System.out.println(FeesCheckbox.isEnabled());
	}
	
	public void feesslider()
	{
		System.out.println("feesslider is enabled or not");
		System.out.println(Feesslider.isEnabled());
	}
	
	public void loanAmountCalculatorPage()
	{
		LoanAmountCalculatorpage.click();
		System.out.println("************************loanAmountCalculatorPage**********************************");

	}
	
	public void loanAmountCheckbox()
	{
		System.out.println("loanAmountCheckbox is enabled or not");
		System.out.println(LoanAmountcheckbox.isEnabled());
	}
	
	public void loanAmountSlider()
	{
		System.out.println("loanAmountSlider is enabled or not");
		System.out.println(LoanAmountSlider.isEnabled());
	}
	
	public void loanInterestCheckbox()
	{
		System.out.println("loanInterestCheckbox is enabled or not");
		System.out.println(LoanInterestCheckbox.isEnabled());
	}
	
	public void loanInterestSlider()
	{
		System.out.println("loanInterestSlider is enabled or not");
		System.out.println(LoanInterestSlider.isEnabled());
	}
	
	public void loanAmountTensurecheckbox()
	{
		System.out.println("loanAmountTensurecheckbox is enabled or not");
		System.out.println(LoanAmountTensurecheckbox.isEnabled());
	}
	
	
	public void loanYear()
	{
		LoanYear.click();
	}
	
	public void loanAmountTensureScale()
	{
		String value1 =LoanAmountTensurescale1.getText();
		System.out.println(value1);
		loanYear();
		String value2 =LoanAmountTensurescale2.getText();
		System.out.println(value2);
		
		if(value1.equals(value2)) {
			System.out.println("Failed");
		} else {
			System.out.println("Passed");
		}
	}
	
	public void chargesCheckbox()
	{
		System.out.println("chargesCheckbox is enabled or not");
		System.out.println(ChargesCheckbox.isEnabled());
	}
	
	public void chargesSlider()
	{
		System.out.println("chargesSlider is enabled or not");
		System.out.println(ChargesSlider.isEnabled());
	}
	
	public void loanTensureCalculatorPage()
	{
		LoanTensureCalculatorPage.click();
		System.out.println("************************loanTensureCalculatorPage**********************************");
	}
	
	public void loanTensureAmountcheckbox()
	{
		System.out.println("loanTensureAmountcheckbox is enabled or not");
		System.out.println(LoanTensureAmountcheckbox.isEnabled());
	}
	
	public void loanTensureAmountSlider()
	{
		System.out.println("loanTensureAmountSlider is enabled or not");
		System.out.println(LoanTensureAmountSlider.isEnabled());
	}
	
	public void loanTensureEmicheckbox()
	{
		System.out.println("loanTensureEmicheckbox is enabled or not");
		System.out.println(LoanTensureEmicheckbox.isEnabled());
	}
	
	public void loanTensureEmiSlider()
	{
		System.out.println("loanTensureEmiSlider is enabled or not");
		System.out.println(LoanTensureEmiSlider.isEnabled());
	}
	
	public void loanAmountInterestcheckbox()
	{
		System.out.println("loanAmountInterestcheckbox is enabled or not");
		System.out.println(LoanAmountInterestcheckbox.isEnabled());
	}
	
	public void loanAmountInterestSlider()
	{
		System.out.println("loanAmountInterestSlider is enabled or not");
		System.out.println(LoanAmountInterestSlider.isEnabled());
	}
	
	public void loanAmountfeesCheckbox()
	{
		System.out.println("loanAmountfeesCheckbox is enabled or not");
		System.out.println(LoanAmountfeesCheckbox.isEnabled());	
	}
	
	public void loanAmountfeesSlider()
	{
		System.out.println("loanAmountfeesSlider is enabled or not");
		System.out.println(LoanAmountfeesSlider.isEnabled());	

	}
}
