package TestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.NoSuchElementException;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\Ashok Kumar\\eclipse-workspace\\CucumberWithSelenium\\Features",
			glue={"StepDefinition"},
					monochrome = true,
					publish = true,
					dryRun= false,
			tags = "@RegressionTest")
//@CucumberOptions(features="Features",glue={"StepDefinition"})
public class Runner {

}
