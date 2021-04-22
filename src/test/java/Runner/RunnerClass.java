package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\flipkart.feature",glue="StepPackage",dryRun=false)

public class RunnerClass {
	

}
