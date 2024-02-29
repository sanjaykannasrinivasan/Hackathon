package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CarLoan extends BasePage{

	public CarLoan(WebDriver driver) {
		super(driver);
	}
	Actions act;
	
	@FindBy(xpath = "//a[text()='Car Loan']")
	WebElement CarLoan;
	
	@FindBy(xpath = "(//span)[3]")
	WebElement CarLoanAmountslider;
	
	@FindBy(xpath = "(//span)[15]")
	WebElement CarInterestslider;
	
	@FindBy(xpath = "(//span)[30]")
	WebElement CarTensureslider;	
 
	@FindBy(xpath = "//div[@id='emiamount']//span")
	WebElement LoanEMI;
	
	@FindBy(xpath = "(//*[@class='btn btn-secondary'])[1]")
	WebElement Monbutton;
	
	@FindBy(xpath = "//input[@id='loanterm']")
	WebElement Textbox;
	
	@FindBy(xpath = "//div[@id='emitotalinterest']/p")
	WebElement InterestRate;
	
	@FindBy(xpath = "//div[@id='emitotalamount']/p")
	WebElement PrincipalAmount;
		
	
	public void carloan() throws InterruptedException
	{
		CarLoan.click();
			
	}
	
	public void carLoanAmountSlider() throws InterruptedException
	{
		act= new Actions(driver);
		act.dragAndDropBy(CarLoanAmountslider, 355, 230).build().perform();
	}
	
	public void interestSlider()
	{
		act= new Actions(driver);
		act.dragAndDropBy(CarInterestslider, 40, 50).build().perform();
	}

	public void tensureSlider()
	{
		act = new Actions(driver);
		act.dragAndDropBy(CarTensureslider, -380, -400).build().perform();
	}
	
	public void loanEmi()
	{
        String LE=LoanEMI.getText();
		System.out.println("LoanEMI:"+LE);
	}
	
	public void monButton()
	{
		Monbutton.click();
	}
	
	public void textBox()
	{
		Textbox.sendKeys(Keys.BACK_SPACE);
		Textbox.sendKeys(Keys.ENTER);	
	}
		
	public void principalamount()
	{
		String IA=InterestRate.getText();
		String [] c = IA.split("₹");
		String [] d = c[1].split(",");
		String out = d[0]+d[1];
		int outRes= Integer.parseInt(out);
		System.out.println("InterestAmount:"+outRes);
		
		String PA=PrincipalAmount.getText();
		String[] a = PA.split("₹");
		String[] b = a[1].split(",");
		String fin = b[0]+b[1]+b[2];
		int fina1= Integer.parseInt(fin);
		int PrincipalAmount = fina1-outRes;
		System.out.println("PrincipalAmount:"+PrincipalAmount);
	}
}

