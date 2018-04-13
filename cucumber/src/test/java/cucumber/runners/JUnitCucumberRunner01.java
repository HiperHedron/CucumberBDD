package cucumber.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/entry", glue="cucumber.stepDefinition")
public class JUnitCucumberRunner01 {

}
