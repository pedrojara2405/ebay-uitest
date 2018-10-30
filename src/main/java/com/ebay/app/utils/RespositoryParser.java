package com.ebay.app.utils;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RespositoryParser {
    private FileInputStream _stream;
    private String _repositoryFile;
    private Properties _propertyFile = new Properties();

    public RespositoryParser(String fileName) throws IOException {
        this._repositoryFile = fileName;
        _stream = new FileInputStream(_repositoryFile);
        _propertyFile.load(_stream);
    }

    public By getbjectLocator(String locatorName) {
        String locatorProperty = _propertyFile.getProperty(locatorName);
        System.out.println(locatorProperty.toString());
        String locatorType = locatorProperty.split(":")[0];
        String locatorValue = locatorProperty.split(":")[1];

        By locator = null;
        switch (locatorType) {
            case "Id":
                locator = By.id(locatorValue);
                break;
            case "Name":
                locator = By.name(locatorValue);
                break;
            case "CssSelector":
                locator = By.cssSelector(locatorValue);
                break;
            case "LinkText":
                locator = By.linkText(locatorValue);
                break;
            case "PartialLinkText":
                locator = By.partialLinkText(locatorValue);
                break;
            case "TagName":
                locator = By.tagName(locatorValue);
                break;
            case "Xpath":
                locator = By.xpath(locatorValue);
                break;
        }
        return locator;
    }
}
