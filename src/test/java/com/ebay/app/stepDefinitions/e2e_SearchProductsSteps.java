package com.ebay.app.stepDefinitions;

import com.ebay.app.managers.PageObjectManager;
import com.ebay.app.managers.WebDriverManager;
import com.ebay.app.pageObjecs.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class e2e_SearchProductsSteps {

    private WebDriver _driver;

    private HomePage _homePage;
    private SearchPage _searchPage;
    private SearchResultsPage _searchResultsPage;
    private SelectSearchBrandFilterPage _selectSearchBrandFilterPage;
    private SelectSearchSizeFilterPage _selectSearchSizeFilterPage;
    private ConsoleResultsPage _consoleResultsPage;

    private PageObjectManager _pageObjectManager;
    private WebDriverManager _webDriverManager;

    @Given("^user goes to Ebay Home page$")
    public void user_goes_to_Ebay_home_page() {
        _webDriverManager = new WebDriverManager();
        _driver = _webDriverManager.getDriver();
        _pageObjectManager = new PageObjectManager(_driver);

        _homePage = _pageObjectManager.getHomePage();
        _homePage.navigateTo_HomePage();
    }

    @When("^user searches for \"([^\"]*)\"$")
    public void searches_for(String searchCriteria) {
        _searchPage = _pageObjectManager.getSearchPage();
        _searchPage.perform_Search_By_Criteria(searchCriteria);
    }

    @Then("^search results are shown$")
    public void search_results_are_loaded() {
        _searchResultsPage = _pageObjectManager.getSearchResultsPage();
        Assert.assertTrue(_searchResultsPage.isShown_ResultsCount(), "Error showing search results count");
    }

    @When("^selects brand \"([^\"]*)\"$")
    public void selects_brand(String brand) {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }

    @When("^selects size \"([^\"]*)\"$")
    public void selects_size(String size) {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }

    @Then("^the test prints in console the number of results$")
    public void prints_in_console_the_numbers_of_results() {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }

    @When("^user orders the products by \"([^\"]*)\" in \"([^\"]*)\" mode$")
    public void orders_the_products_by(String field, String mode) {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }

    @Then("^the test asserts the order taking the first \"([^\"]*)\" results$")
    public void asserts_the_order_taking_the_first_results(String numberResults) {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }

    @Then("^the test takes the first \"([^\"]*)\" products with their prices$")
    public void takes_the_first_products_with_their_prices(String numberResults) {
        //_driver.navigate().to("http://shop.demoqa.com/?s=" + something + "&post_type=product");
    }

}
