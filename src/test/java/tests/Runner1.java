package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\resources\\features\\Feature1.feature"},
					glue={"gluecode"},
					tags="@smoketest or @realtest",
					monochrome=true,
					plugin={"pretty","html:target/smoketestres","rerun:target/failedsmoketests.txt"}
		)
public class Runner1 extends AbstractTestNGCucumberTests
{
}
