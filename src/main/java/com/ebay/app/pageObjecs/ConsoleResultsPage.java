package com.ebay.app.pageObjecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConsoleResultsPage {

    private final WebDriver _driver;

    public ConsoleResultsPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }
}
