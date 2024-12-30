package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression",
        features = {"src/test/resources/FeaturesWithTags"},
        glue = {"stepdefinitions"},
        plugin = {"pretty", "html:target/html Reports.html"})
public class LoginRunnerWithTags extends AbstractTestNGCucumberTests {
}
