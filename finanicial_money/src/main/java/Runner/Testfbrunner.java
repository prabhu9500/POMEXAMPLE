package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".\\MyFeature\\mysecondFeature.feature",glue = "stepDef")

public class Testfbrunner extends AbstractTestNGCucumberTests {

	
	
	
}
