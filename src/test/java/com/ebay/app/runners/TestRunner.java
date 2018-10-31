package com.ebay.app.runners;

import com.ebay.app.managers.FileReaderManager;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTests"
        , glue = {"com/ebay/app/stepDefinitions"}
        , tags = {"@Ignored,@End2EndTest"}
        , plugin = {"pretty", "html:target/cucumber-reports",
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"}

        /*,plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"}*/
        ,monochrome = true
)
public class TestRunner {
    @AfterClass
    public static void writeExtentReport() {
        //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
    }
}
