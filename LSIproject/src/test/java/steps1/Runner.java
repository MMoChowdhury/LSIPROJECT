package steps1;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features="src/test/java/Feature1",
glue= "steps1",
monochrome = true,
snippets = SnippetType.CAMELCASE


		
		)
public class Runner extends AbstractTestNGCucumberTests{
	

}
