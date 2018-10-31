package com.ebay.app.stepDefinitions;

import com.ebay.app.helpers.TestContext;
import com.ebay.app.pageObjecs.*;
import cucumber.api.java.en.Given;

public class HomePageSteps {

    private TestContext _testContext;

    private HomePage _homePage;

    public HomePageSteps(TestContext testContext) {
        _testContext = testContext;
        _homePage = _testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user goes to Ebay Home page$")
    public void user_goes_to_Ebay_home_page() {
        _homePage.navigateTo_HomePage();
    }
}
