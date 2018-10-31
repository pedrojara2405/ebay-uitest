package com.ebay.app.managers;

import com.ebay.app.pageObjecs.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver _driver;

    private HomePage _homePage;
    private SearchPage _searchPage;
    private SearchResultsPage _searchResultsPage;
    private SearchBrandFilterPage _searchBrandFilterPage;
    private SearchSizeFilterPage _searchSizeFilterPage;
    private ConsoleResultsPage _consoleResultsPage;

    public PageObjectManager(WebDriver driver) {
        this._driver = driver;
    }

    public HomePage getHomePage() {
        return (_homePage == null) ? _homePage = new HomePage(_driver) : _homePage;
    }

    public SearchPage getSearchPage() {
        return (_searchPage == null) ? _searchPage = new SearchPage(_driver) : _searchPage;
    }

    public SearchResultsPage getSearchResultsPage() {
        return (_searchResultsPage == null) ? _searchResultsPage = new SearchResultsPage(_driver) : _searchResultsPage;
    }

    public SearchBrandFilterPage getSearchBrandFilterPage() {
        return (_searchBrandFilterPage == null) ? _searchBrandFilterPage = new SearchBrandFilterPage(_driver) : _searchBrandFilterPage;
    }

    public SearchSizeFilterPage getSearchSizeFilterPage() {
        return (_searchSizeFilterPage == null) ? _searchSizeFilterPage = new SearchSizeFilterPage(_driver) : _searchSizeFilterPage;
    }

    public ConsoleResultsPage getConsoleResultsPage() {
        return (_consoleResultsPage == null) ? _consoleResultsPage = new ConsoleResultsPage(_driver) : _consoleResultsPage;
    }
}
