package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".\\MyFeature\\Parameter.feature",
				 glue = "stepDef",
				 dryRun = false,
				 monochrome = true)
public class TestRunner1 extends AbstractTestNGCucumberTests
{

}
