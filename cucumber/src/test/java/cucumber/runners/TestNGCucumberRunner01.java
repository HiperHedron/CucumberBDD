package cucumber.runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Core;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "features",
        glue = {"cucumber.stepDefinition"},
        tags = {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
                }
)
public class TestNGCucumberRunner01 extends Core{
	
	private TestNGCucumberRunner runNG;
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
		runNG = new TestNGCucumberRunner(this.getClass());
    }
	
	/*@AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
		runNG.finish();
    }*/
	
	@Test(
		dataProvider = "features",
		description = "facebook login test"
	)
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		runNG.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
    public Object[][] features() {
        return runNG.provideFeatures();
    }

}
