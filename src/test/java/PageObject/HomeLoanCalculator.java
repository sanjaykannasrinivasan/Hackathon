package PageObject;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ExcelUtilities;

public class HomeLoanCalculator extends BasePage {
	public HomeLoanCalculator(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@id='menu-item-dropdown-2696']")
	WebElement calculator1;
	
	@FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
	WebElement Homeloancalculator;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement HomeValue;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement Downpayment ;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
    WebElement homeloaninsuranceamount;
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	WebElement homeloanamount;
	
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	WebElement homeloaninterest;

	@FindBy(xpath = "(//input[@class='form-control'])[6]")
	WebElement homeloanterm;
	
	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	WebElement loanfees;
	
	@FindBy(xpath = "(//input[@class='form-control'])[8]")
	WebElement startmonthyear;
	
	@FindBy(xpath = "(//span[@class='month'])[5]")
	WebElement Month;
	
	@FindBy(xpath = "(//input[@class='form-control'])[9]")
	WebElement onetimeexpenses;
	
	@FindBy(xpath = "(//input[@class='form-control'])[10]")
	WebElement propertytaxes;
	
	@FindBy(xpath = "(//input[@class='form-control'])[11]")
	WebElement homeinsurance;
	
	@FindBy(xpath = "(//input[@class='form-control'])[12]")
	WebElement maintenanceexpenses;
	
	@FindBy(xpath = "//th[text()='Taxes, Home Insurance & Maintenance (C)']")
	WebElement Scroll;
	
	@FindBy(xpath = "//table[@class='noextras']/tbody")
	WebElement yeartable;
	
	@FindBy(xpath = "//table[@class='noextras']/tbody/tr")
	List<WebElement> yeartablerow;
	
	
    //user click on calculator from the menu
	public void calculator1() 
	{
		calculator1.click();
	}
	
	//user click on homeLoancalculator on the dropdown
	public void homeLoancalculator()
	{
		Homeloancalculator.click();
	}
	
	//user give relevant details in homevalue chechbox
	public void homevalue() throws IOException
	{
		HomeValue.clear();
		HomeValue.sendKeys(Keys.BACK_SPACE);
		HomeValue.sendKeys(ExcelUtilities.getCellData("Sheet2", 0, 1));
	}
	
	//user gives relevant details in downpayment checkbox
	public void downPayment() throws IOException
	{
		Downpayment.clear();
		Downpayment.sendKeys(Keys.BACK_SPACE);
		Downpayment.sendKeys(ExcelUtilities.getCellData("Sheet2", 1, 1));
	}
	
	//user gives relevant details in homeloaninsuranceamount checkbox
	public void homeloaninsuranceamount() throws IOException
	{
		homeloaninsuranceamount.clear();
		homeloaninsuranceamount.sendKeys(Keys.BACK_SPACE);
		homeloaninsuranceamount.sendKeys(ExcelUtilities.getCellData("Sheet2", 2, 1));
	}

	//user gives relevant details in homeloanamount checkbox
	public void homeloanamount() throws IOException
	{
		homeloanamount.clear();
		homeloanamount.sendKeys(Keys.BACK_SPACE);
		homeloanamount.sendKeys(ExcelUtilities.getCellData("Sheet2", 3, 1));
	}
	
	//user gives relevant details in homeloaninterest checkbox
	public void homeloaninterest() throws IOException
	{
		homeloaninterest.clear();
		homeloaninterest.sendKeys(Keys.BACK_SPACE);
		homeloaninterest.sendKeys(ExcelUtilities.getCellData("Sheet2", 4, 1));
	}
	
	//user gives relevant details in homeloanterm checkbox
	public void homeloanterm() throws IOException
	{
		homeloanterm.clear();
		homeloanterm.sendKeys(Keys.BACK_SPACE);
		homeloanterm.sendKeys(Keys.BACK_SPACE);
		homeloanterm.sendKeys(ExcelUtilities.getCellData("Sheet2", 5, 1));
	}
	
	//user gives relevant details in loanfees checkbox
	public void loanfees() throws IOException
	{
		loanfees.clear();
		loanfees.sendKeys(Keys.BACK_SPACE);
		loanfees.sendKeys(ExcelUtilities.getCellData("Sheet2", 6, 1));
	}
	
	//user gives relevant details in startmonthyear checkbox
	public void startmonthyear()
	{
		startmonthyear.click();
	}
	
    //user click on month from the menu
	public void month()
	{
		Month.click();
	}
	
	//user gives relevant details in onetimeexpenses checkbox
	public void onetimeexpenses() throws IOException
	{
		onetimeexpenses.clear();
		onetimeexpenses.sendKeys(Keys.BACK_SPACE);
		onetimeexpenses.sendKeys(ExcelUtilities.getCellData("Sheet2", 7, 1));
	}
	
	//user gives relevant details in propertytaxes checkbox
	public void propertytaxes() throws IOException
	{
		propertytaxes.clear();
		propertytaxes.sendKeys(Keys.BACK_SPACE);
		propertytaxes.sendKeys(ExcelUtilities.getCellData("Sheet2", 8, 1));
	}
	
	//user gives relevant details in homeinsurance checkbox
	public void homeinsurance() throws IOException
	{
		homeinsurance.clear();
		homeinsurance.sendKeys(Keys.BACK_SPACE);
		homeinsurance.sendKeys(ExcelUtilities.getCellData("Sheet2", 9, 1));
	}
	
	//user gives relevant details in maintenanceexpenses checkbox
	public void maintenanceexpenses() throws IOException
	{
		maintenanceexpenses.clear();
		maintenanceexpenses.sendKeys(Keys.BACK_SPACE);
		maintenanceexpenses.sendKeys(ExcelUtilities.getCellData("Sheet2", 10, 1));
		maintenanceexpenses.sendKeys(Keys.ENTER);
	}
	
	//user scrolling the page
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Scroll);	
	}

	//user extract the details from year table
	public void yeartable() throws IOException
	{
		 ExcelUtilities.write("Sheet1", 0, 0,"Year");
		 ExcelUtilities.write("Sheet1", 0, 1,"Principal");
		 ExcelUtilities.write("Sheet1", 0, 2,"Interest");
		 ExcelUtilities.write("Sheet1", 0, 3,"Taxes, Home Insurance & Maintenance (C)");
		 ExcelUtilities.write("Sheet1", 0, 4,"Total Payment ");
		 ExcelUtilities.write("Sheet1", 0, 5,"Balance");
		 ExcelUtilities.write("Sheet1", 0, 6,"Loan Paid To Date");

		 int sizeOfrows=yeartablerow.size();
		 for( int r=2;r<=sizeOfrows;r=r+2) {
			String Year= yeartable.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
			String Principal= yeartable.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
			String Interest= yeartable.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
			String Taxes= yeartable.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
			String Total_Payment= yeartable.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
			String Balance= yeartable.findElement(By.xpath("tr["+r+"]/td[6]")).getText();
			String Loan=yeartable.findElement(By.xpath("tr["+r+"]/td[7]")).getText();
			 ExcelUtilities.write("Sheet1",r , 0,Year );
			 ExcelUtilities.write("Sheet1",r , 1,Principal );
			 ExcelUtilities.write("Sheet1",r , 2,Interest );
			 ExcelUtilities.write("Sheet1",r , 3,Taxes );
			 ExcelUtilities.write("Sheet1",r , 4,Total_Payment );
			 ExcelUtilities.write("Sheet1",r , 5,Balance );
			 ExcelUtilities.write("Sheet1",r , 6,Loan);
		 	}
	}
	
}

