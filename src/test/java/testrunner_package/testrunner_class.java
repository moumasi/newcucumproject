package testrunner_package;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/feature_folder"},
plugin = {"json:target/cucumber.json"},
glue = "stepdefination_package",tags = {"@home"})


public class testrunner_class extends AbstractTestNGCucumberTests   {

}
