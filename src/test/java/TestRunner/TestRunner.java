package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { ".//FeatureFile" }, //featurefile folder
glue="StepDefination", //packagename for the step defination
dryRun = false, monochrome = true,
plugin = {
		"pretty", "html:target/Cucumber-report/Landing.html" },

		tags = "easemytrip"

)

//the cucumber file will always be empty

public class TestRunner {

}


