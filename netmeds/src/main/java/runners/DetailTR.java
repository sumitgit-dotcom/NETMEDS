package runners;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith((Class<? extends Runner>) Cucumber.class)

@CucumberOptions(
		
		 features = "src/test/resources/features",
		 glue = {"stepDefinitions"},
		 plugin = {"pretty", "html:target/cucumber-reports"},
		 monochrome = true 
		)

public class DetailTR {

}
