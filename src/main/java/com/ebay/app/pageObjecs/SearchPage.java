package com.ebay.app.pageObjecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private final WebDriver _driver;

    private final String _txtSearchAutocompleteXpath = "//input[@id='gh-ac']";
    private final String _btnSearchXpath = "//input[@id='gh-btn']";

    @FindBy(how = How.XPATH, using = _txtSearchAutocompleteXpath)
    private WebElement _txt_SearchAutocomplete;

    @FindBy(how = How.XPATH, using = _btnSearchXpath)
    @CacheLookup
    private WebElement _btn_Search;

    public SearchPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enter_SearchCriteria(String name) {
        _txt_SearchAutocomplete.sendKeys(name);
    }

    public void clickOn_Search() {
        _btn_Search.click();
    }

    public void perform_Search_By_Criteria(String searchCriteria) {
        enter_SearchCriteria(searchCriteria);
        clickOn_Search();
    }
}
