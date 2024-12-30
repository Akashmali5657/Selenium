package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/test/resources/CRM Features/Login.feature"}, // feature file path
        glue = {"stepdefinitions"},// step definition location path
        dryRun = false, //it will match feature and step definitions file data, if step definition miss it will show in one line.
        //And if its true it will only do dry run it will not open browser
        monochrome = true,// display console output in readable format
        plugin = {"pretty", "html:target/html Reports.html"}) // report generation and consult output format
public class loginCRM extends AbstractTestNGCucumberTests {
}