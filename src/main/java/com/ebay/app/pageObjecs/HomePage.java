package com.ebay.app.pageObjecs;

import com.ebay.app.managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver _driver;

    public HomePage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void
    navigateTo_HomePage() {
        _driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }
}
