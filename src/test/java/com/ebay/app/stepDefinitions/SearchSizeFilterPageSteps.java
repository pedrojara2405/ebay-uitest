package com.ebay.app.stepDefinitions;

import com.ebay.app.helpers.TestContext;
import com.ebay.app.managers.PageObjectManager;
import com.ebay.app.pageObjecs.SearchBrandFilterPage;
import com.ebay.app.pageObjecs.SearchSizeFilterPage;
import cucumber.api.java.en.When;

public class SearchSizeFilterPageSteps {

    private TestContext _testContext;

    private SearchSizeFilterPage _searchSizeFilterPage;

    public SearchSizeFilterPageSteps(TestContext testContext) {
        _testContext = testContext;
        _searchSizeFilterPage = _testContext.getPageObjectManager().getSearchSizeFilterPage();
    }

    @When("^selects size \"([^\"]*)\"$")
    public void selects_size(String size) {
        _searchSizeFilterPage.check_SizeItem(size,false);
    }
}
