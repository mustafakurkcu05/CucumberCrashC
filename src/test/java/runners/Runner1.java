package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/ScenarioOutline.feature"},
        glue = {"stepdefs"}
)
public class Runner1 extends AbstractTestNGCucumberTests {
}
