package com.ebay.app.stepDefinitions;

import com.ebay.app.helpers.TestContext;
import com.ebay.app.managers.PageObjectManager;
import com.ebay.app.pageObjecs.SearchBrandFilterPage;
import com.ebay.app.pageObjecs.SearchPage;
import cucumber.api.java.en.When;

public class SearchPageSteps {

    private TestContext _testContext;

    private SearchPage _searchPage;

    public SearchPageSteps(TestContext testContext) {
        _testContext = testContext;
        _searchPage = _testContext.getPageObjectManager().getSearchPage();
    }

    @When("^user searches for \"([^\"]*)\"$")
    public void searches_for(String searchCriteria) {
        _searchPage.perform_Search_By_Criteria(searchCriteria);
    }
}
