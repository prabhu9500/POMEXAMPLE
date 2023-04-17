package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".\\MyFeature\\MyFirstFeature.feature",
				 glue = "stepDef",
				 tags = "@SC003",
				 monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
