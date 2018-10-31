package com.ebay.app.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowseFactory {
    private static Map<String, WebDriver> _drivers = new HashMap<String, WebDriver>();

    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.firefox.driver";
    private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private static final String EDGE_DRIVER_PROPERTY = "webdriver.edge.driver";


    /*
     * Factory method for getting browsers
     */
    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
            case "Chrome":
                driver = _drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    _drivers.put("Chrome", driver);
                }
                break;
            case "Firefox":
                driver = _drivers.get("Firefox");
                if (driver == null) {
                    System.setProperty("webdriver.firefox.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    _drivers.put("Firefox", driver);
                }
                break;
            case "IE":
                driver = _drivers.get("IE");
                if (driver == null) {
                    System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Drivers\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    _drivers.put("IE", driver);
                }
                break;
            case "Edge":
                driver = _drivers.get("Edge");
                if (driver == null) {
                    System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\MicrosoftWebDriver.exe");
                    driver = new InternetExplorerDriver();
                    _drivers.put("IE", driver);
                }
                break;

        }
        return driver;
    }

    public static void closeAllDriver() {
        for (String key : _drivers.keySet()) {
            _drivers.get(key).close();
            _drivers.get(key).quit();
        }
    }
}
