package com.ebay.app.pageObjecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchBrandFilterPage {

    private final WebDriver _driver;

    private final String _cbxBrandItemXpath = "//a[@class='cbx']/span[@class='cbx'][normalize-space()='%s']/preceding-sibling::input";

    //@FindBy(how = How.XPATH, using = _cbxBrandItemXpath)
    private WebElement _cbx_BrandItem;

    public SearchBrandFilterPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void check_BrandItem(String brandName, boolean value) {
        _cbx_BrandItem = _driver.findElement(By.xpath(String.format(_cbxBrandItemXpath, brandName)));
        if(!value) _cbx_BrandItem.click();
        try { Thread.sleep(5000);}
        catch (InterruptedException e) {}
    }
}
