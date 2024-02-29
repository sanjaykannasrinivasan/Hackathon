package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//FeaturesFile" }, 
				
				glue = { "StepDefinition" }, 
                 plugin = {"pretty", "html:reports/myreport.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
                 dryRun = false,
                 monochrome = true,
                 publish = true,
                 tags = "@regression")
               

public class TestRunner  {

}