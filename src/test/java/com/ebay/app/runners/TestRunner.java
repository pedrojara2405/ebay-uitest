package com.ebay.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTests"
        , glue = {"com/ebay/app/stepDefinitions"}
        //,dryRun = true
        //,strict = true
        , tags = {"@Ignored,@End2EndTest", "@RegressionTest"}
        , plugin = {"pretty", "html:Test_Reports",
        "json:Test_Reports/cucumber.json",
        "junit:Test_Reports/cucumber.xml"}
)
public class TestRunner {
}
