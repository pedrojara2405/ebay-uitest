package com.ebay.app.managers;

import com.ebay.app.pageObjecs.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver _driver;

    private HomePage _homePage;
    private SearchPage _searchPage;
    private SearchResultsPage _searchResultsPage;
    private SelectSearchBrandFilterPage _selectSearchBrandFilterPage;
    private SelectSearchSizeFilterPage _selectSearchSizeFilterPage;
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

    public SelectSearchBrandFilterPage getSelectSearchBrandFilterPage() {
        return (_selectSearchBrandFilterPage == null) ? _selectSearchBrandFilterPage = new SelectSearchBrandFilterPage(_driver) : _selectSearchBrandFilterPage;
    }

    public SelectSearchSizeFilterPage getSelectSearchSizeFilterPage() {
        return (_selectSearchSizeFilterPage == null) ? _selectSearchSizeFilterPage = new SelectSearchSizeFilterPage(_driver) : _selectSearchSizeFilterPage;
    }

    public ConsoleResultsPage getConsoleResultsPage() {
        return (_consoleResultsPage == null) ? _consoleResultsPage = new ConsoleResultsPage(_driver) : _consoleResultsPage;
    }
}
