package com.ebay.app.pageObjecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchSizeFilterPage {

    private final WebDriver _driver;

    private final String _cbxSizeItemXpath = "//a[@class='cbx']/span[@class='cbx'][normalize-space()='%s']/preceding-sibling::input";

    //@FindBy(how = How.XPATH, using = _cbxBrandItemXpath)
    private WebElement _cbx_SizeItem;

    public SearchSizeFilterPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void check_SizeItem(String brandName, boolean value) {
        _cbx_SizeItem = _driver.findElement(By.xpath(String.format(_cbxSizeItemXpath, brandName)));
        if(!value) _cbx_SizeItem.click();
        try { Thread.sleep(5000);}
        catch (InterruptedException e) {}
    }
}
