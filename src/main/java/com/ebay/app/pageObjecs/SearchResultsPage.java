package com.ebay.app.pageObjecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

    private final WebDriver _driver;

    private final String _btnViewTypeXpath = "//a[@id='viewType']";
    private final String _lblResultsCountXpath = "//span[@class='rcnt']";
    private final String _lblCriteriaInResultsXpath = "//span[@class='kwcat']/b";

    @FindBy(how = How.XPATH, using = _btnViewTypeXpath)
    @CacheLookup
    private WebElement _btn_viewType;

    @FindBy(how = How.XPATH, using = _lblResultsCountXpath)
    private WebElement _lbl_ResultsCount;

    @FindBy(how = How.XPATH, using = _lblCriteriaInResultsXpath)
    private WebElement _lbl_CriteriaInResults;

    public SearchResultsPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isShown_ResultsCount() {
        return _lbl_ResultsCount.isDisplayed();
    }

    public String get_ResultsCount() {
        return _lbl_ResultsCount.getText();
    }

    public String get_CriteriaInResults() {
        return _lbl_CriteriaInResults.getText();
    }
}
