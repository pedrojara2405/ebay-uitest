package com.ebay.app.pageObjecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConsoleResultsPage {

    private final WebDriver _driver;

    public ConsoleResultsPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void printSearchResults(String count, String criteria)
    {
        String result = String.format("Selected filters: %s - Total results: %s",criteria,count);
        System.console().writer().println(result);
    }
}
