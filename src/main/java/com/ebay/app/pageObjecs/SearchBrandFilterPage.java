package com.ebay.app.pageObjecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchBrandFilterPage {

    private final WebDriver _driver;

    public SearchBrandFilterPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*private final String _txtSearchAutocompleteXpath = "//input[@id='gh-ac']";

    @FindBy(how = How.XPATH, using = _txtSearchAutocompleteXpath)
    @CacheLookup
    private WebElement _txt_SearchAutocomplete;*/
}
