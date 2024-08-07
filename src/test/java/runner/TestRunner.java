package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = {
		"stepDefination" }, tags = "@smoke", dryRun = true, monochrome = true, plugin = { "pretty",
				"json:target/cucumber-report/cucumber.json", "html:target/cucumber-reports/cucumber.html" })

public class TestRunner {

}
