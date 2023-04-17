package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".\\MyFeature\\DDF.feature",
				 glue ="stepDef",
				 dryRun= false,
				 monochrome = true)
public class TestRunner2 extends AbstractTestNGCucumberTests
{

}
