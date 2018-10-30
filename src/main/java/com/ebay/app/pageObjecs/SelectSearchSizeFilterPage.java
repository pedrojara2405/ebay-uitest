package com.ebay.app.pageObjecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelectSearchSizeFilterPage {

    private final WebDriver _driver;

    public SelectSearchSizeFilterPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }
}
