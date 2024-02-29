*****************************************************PROJECT DESCRIPTION*****************************************************************

Problem Statement : Find the Interest Amount for current year

1. Buying a  car of 15 Lac
2. Interest rate of 9.5%
3. Tenure should be 1 year.
Display the interest amount & principal amount of first month.


Detailed Description: Hackathon Project

1. Find the EMI for Car with price of 15 Lac, Interest rate of 9.5% & Tenure 1 year; Display the interest amount & principal amount for one month
2. From Menu, pick Home Loan EMI Calculator, fill relevant details & extract all the data from  year on year table & store in excel;
3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; change the Loan tenure for year & month,check the change in scale; Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator

Key Automation Scope:

Validation of transactions & do calculations;
Extract table values & store in excel
Filling data in screen & multiple UI validations
Navigation from Menus
Reusable methods
Scrolling down in web page


**********************************************************STEPS TO EXECUTE*************************************************************

-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestRunner.java,do right click and run 
-Now the file will Execute and we get the expected output as shown below.
-For TestNG got to MasterTestNg xml ,do right click and run 
-Now the file will Execute and we get the expected output as shown below.


*******************************************************FILES DESCRIPTION**************************************************************

1.src/main/java -We are not using this folder
2.src/test/java- There are seven packages in this folder.
-> factory:In this package there is one class Baseclass.java which we launch different browser using its own classes
->pageObjects - In this file,There are four Classes 
                 1)CarLoan.java-To get the interest amount & principal amount of first month
                 2)BasePage.java-To refer current driver to PageFactory
                 3)homeLoanCalculator.java-To fill relevant details & extract all the data from  year on year table & store in excel
                 4)LoanCalaulator.java-To validate all UI check for text box & scales. 

->StepDefinitions- In this file,There are four Classes . It has been created for each scenario.
                 1)CarLoanSteps.java-To get all the contents available in the interest and principal amount for month by getting a method in PageObjects
                 2)Hooks.java-To get the screenshot of failed scenario.
                 3)HomeLoanSteps.java-To get all the contents available in year table in HomeLoanCalculator page by getting a method in PageObjects.
                 4)LoanCalculator.java-Tovalidate all the ui check in textbox and scales by getting method in PageObjects.

->testRunner - Here we have TestRunner.java class where we do run and here we have also added features for generating cucumber report and extentreport.
->utilities- Here we have Read and WriteExcelData.java- To print all the year table contents available in HomeLoanCalculator page.
->testBase - In this package there is one class BaseClass.java which we launch different browser using its own classes in TestNg.
->testCases - In this file,There are three Classes
                 1)CarLoanTest - To get the interest amount & principal amount of first month.
                 2)HomeLoanTest - To fill relevant details & extract all the data from  year on year table & store in excel.
                 3)LoanCalculatorTest - To validate all UI check for text box & scales. 

3.src/test/resources- In this folder, We have three files 
                 1)config.properties-To get name of browser and URL to launch Emi Calculator page
                 2)extent.properties-To get all the properties for generating extentReport
                 3)log4j2.xml-Used to create the log file. 

4.JRE System Library: In this File we have all dependencies of JAR.files.         

5.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed,
Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

6.FeatureFiles:In this folder we have three cucmber feature files
                1Car.feature-We have created a feature, scenario and actions to be performed to get interest amount & principal amount of first month.
                2)Home.feature-We have created a feature, scenario and actions to be performed to extract all the data from  year on year table.
                3)Loan.feature-We have created a feature, scenario and actions to be performed to validate all UI check for text box & scales

7.Report: In this folder the myreport.html is present which is the cucumber report of the project

8.src: In this, there are two folders
	-test:It is an empty folder

9.log: which contains the log file information stored in it.

10.target: It is an empty folder
 
11.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

 
***************************************************************************************************************************************

                                               OUTPUT ON CONSOLE WHILE RUNNING ON TESTNG

***************************************************************************************************************************************

LoanEMI:1,31,525
InterestAmount:11875
PrincipalAmount:1500000
************************emiamountPage**********************************
emiamountCheckbox is enabled or not
true
emiamountslider is enabled or not
true
emiInterestCheckbox is enabled or not
true
emiInterestSlider is enabled or not
true
emiInterestCheckbox is enabled or not
true
emiInterestSlider is enabled or not
true
emiTensureCheckbox is enabled or not
true
60
5
Passed
feesCheckbox is enabled or not
true
feesslider is enabled or not
true
************************loanAmountCalculatorPage**********************************
loanAmountCheckbox is enabled or not
true
loanAmountSlider is enabled or not
true
loanInterestCheckbox is enabled or not
true
loanInterestSlider is enabled or not
true
loanAmountTensurecheckbox is enabled or not
true
60
5
Passed
chargesCheckbox is enabled or not
true
chargesSlider is enabled or not
true
************************loanTensureCalculatorPage**********************************
loanTensureAmountcheckbox is enabled or not
true
loanTensureAmountSlider is enabled or not
true
loanTensureEmicheckbox is enabled or not
true
loanTensureEmiSlider is enabled or not
true
loanAmountInterestcheckbox is enabled or not
true
loanAmountInterestSlider is enabled or not
true
loanAmountfeesCheckbox is enabled or not
true
loanAmountfeesSlider is enabled or not
true




***************************************************************************************************************************************

                                               OUTPUT ON CONSOLE WHILE RUNNING ON CUCUMBER

***************************************************************************************************************************************


@smoke @regression
Scenario: Calculating Emi for a Car Loan                                   # FeaturesFile/Car.feature:4
  Given user should navigate to the HomePage                               # StepDefinition.CarLoanSteps.user_should_navigate_to_the_home_page()

    Embedding Calculating Emi for a Car Loan [image/png 182507 bytes]

  When user should enter loan Amount ,interest rate and loan Tenure        # StepDefinition.CarLoanSteps.user_should_enter_loan_amount_interest_rate_and_loan_tenure()

    Embedding Calculating Emi for a Car Loan [image/png 169175 bytes]

LoanEMI:1,31,525
  Then user should find the Emi for one Year                               # StepDefinition.CarLoanSteps.user_should_find_the_emi_for_one_year()

    Embedding Calculating Emi for a Car Loan [image/png 170878 bytes]

InterestAmount:11875
PrincipalAmount:1500000
  And user should display the principal  and Interest amount for one month # StepDefinition.CarLoanSteps.user_should_display_the_principal_and_interest_amount_for_one_month()

    Embedding Calculating Emi for a Car Loan [image/png 170849 bytes]


@regression
Scenario: Calculating Emi for HomeLoan and display the data in the excel # FeaturesFile/Home.feature:4

  Given user should navigate to the HomeLoan EMI Calculator Page         # StepDefinition.HomeLoanSteps.user_should_navigate_to_the_home_loan_emi_calculator_page()

    Embedding Calculating Emi for HomeLoan and display the data in the excel [image/png 188378 bytes]

  When user should enter the relevant details                            # StepDefinition.HomeLoanSteps.user_should_enter_the_relevant_details()

    Embedding Calculating Emi for HomeLoan and display the data in the excel [image/png 189409 bytes]

  And user should store the datas in the Excel sheet                     # StepDefinition.HomeLoanSteps.user_should_store_the_datas_in_the_excel_sheet()

    Embedding Calculating Emi for HomeLoan and display the data in the excel [image/png 175393 bytes]


@regression
Scenario: UI Validation                                                                        # FeaturesFile/Loan.feature:4
************************emiamountPage**********************************
  Given user should navigate to the LoanCalculator                                             # StepDefinition.LoanCalculator.user_should_navigate_to_the_loan_calculator()

    Embedding UI Validation [image/png 223986 bytes]

emiamountCheckbox is enabled or not
true
emiamountslider is enabled or not
true
emiInterestCheckbox is enabled or not
true
emiInterestSlider is enabled or not
true
emiInterestCheckbox is enabled or not
true
emiInterestSlider is enabled or not
true
emiTensureCheckbox is enabled or not
true
60
5
Passed
feesCheckbox is enabled or not
true
feesslider is enabled or not
true
  Then user should perform UI validation for all the textBoxes and slider for EmiCalculator    # StepDefinition.LoanCalculator.user_should_perform_ui_validation_for_all_the_text_boxes_and_slider_for_emi_calculator()

    Embedding UI Validation [image/png 148530 bytes]

************************loanAmountCalculatorPage**********************************
loanAmountCheckbox is enabled or not
true
loanAmountSlider is enabled or not
true
loanInterestCheckbox is enabled or not
true
loanInterestSlider is enabled or not
true
loanAmountTensurecheckbox is enabled or not
true
60
5
Passed
chargesCheckbox is enabled or not
true
chargesSlider is enabled or not
true
  And user should perform UI validation for all textboxes and slider for LoanAmount Calculator # StepDefinition.LoanCalculator.user_should_perform_ui_validation_for_all_textboxes_and_slider_for_loan_amount_calculator()

    Embedding UI Validation [image/png 141099 bytes]

************************loanTensureCalculatorPage**********************************
loanTensureAmountcheckbox is enabled or not
true
loanTensureAmountSlider is enabled or not
true
loanTensureEmicheckbox is enabled or not
true
loanTensureEmiSlider is enabled or not
true
loanAmountInterestcheckbox is enabled or not
true
loanAmountInterestSlider is enabled or not
true
loanAmountfeesCheckbox is enabled or not
true
loanAmountfeesSlider is enabled or not
true
  And user should perform UI validation for all textboxes and slider for LoanTenure Calculator # StepDefinition.LoanCalculator.user_should_perform_ui_validation_for_all_textboxes_and_slider_for_loan_tenure_calculator()

    Embedding UI Validation [image/png 144528 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/68ec7651-c41e-4623-a37e-3ac0ef66ce08 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘


