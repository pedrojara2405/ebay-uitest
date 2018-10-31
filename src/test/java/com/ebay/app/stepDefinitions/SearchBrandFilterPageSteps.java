package com.ebay.app.stepDefinitions;

import com.ebay.app.helpers.TestContext;
import com.ebay.app.managers.PageObjectManager;
import com.ebay.app.pageObjecs.ConsoleResultsPage;
import com.ebay.app.pageObjecs.SearchBrandFilterPage;
import cucumber.api.java.en.When;

public class SearchBrandFilterPageSteps {

    private TestContext _testContext;

    private SearchBrandFilterPage _searchBrandFilterPage;

    public SearchBrandFilterPageSteps(TestContext testContext) {
        _testContext = testContext;
        _searchBrandFilterPage = _testContext.getPageObjectManager().getSearchBrandFilterPage();
    }

    @When("^selects brand \"([^\"]*)\"$")
    public void selects_brand(String brand) {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }
}
