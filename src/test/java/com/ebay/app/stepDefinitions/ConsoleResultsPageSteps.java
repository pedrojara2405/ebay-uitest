package com.ebay.app.stepDefinitions;

import com.ebay.app.helpers.TestContext;
import com.ebay.app.managers.PageObjectManager;
import com.ebay.app.pageObjecs.ConsoleResultsPage;
import com.ebay.app.pageObjecs.HomePage;
import cucumber.api.java.en.Then;

public class ConsoleResultsPageSteps {

    private TestContext _testContext;

    private ConsoleResultsPage _consoleResultsPage;

    public ConsoleResultsPageSteps(TestContext testContext) {
        _testContext = testContext;
        _consoleResultsPage = _testContext.getPageObjectManager().getConsoleResultsPage();
    }

    @Then("^the test prints in console the number of results$")
    public void prints_in_console_the_numbers_of_results() {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }

    @Then("^the test asserts the order taking the first \"([^\"]*)\" results$")
    public void asserts_the_order_taking_the_first_results(String numberResults) {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }
}
