package com.ebay.app.stepDefinitions;

import com.ebay.app.helpers.TestContext;
import com.ebay.app.managers.PageObjectManager;
import com.ebay.app.pageObjecs.SearchPage;
import com.ebay.app.pageObjecs.SearchResultsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SearchResultsPageSteps {

    private TestContext _testContext;

    private SearchResultsPage _searchResultsPage;

    public SearchResultsPageSteps(TestContext testContext) {
        _testContext = testContext;
        _searchResultsPage = _testContext.getPageObjectManager().getSearchResultsPage();
    }

    @Then("^search results are shown$")
    public void search_results_are_loaded() throws InterruptedException {
        Assert.assertTrue(_searchResultsPage.isShown_ResultsCount(), "Error showing search results count");
    }

    @When("^user orders the products by \"([^\"]*)\" in \"([^\"]*)\" mode$")
    public void orders_the_products_by(String field, String mode) {
    }

    @Then("^the test takes the first \"([^\"]*)\" products with their prices$")
    public void takes_the_first_products_with_their_prices(String numberResults) {
    }
}
