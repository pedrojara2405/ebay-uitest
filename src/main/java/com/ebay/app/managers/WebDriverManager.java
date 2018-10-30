package com.ebay.app.managers;

import com.ebay.app.enums.DriverType;
import com.ebay.app.enums.EnvironmentType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {

    private WebDriver _driver;
    private static DriverType _driverType;
    private static EnvironmentType _environmentType;

    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.firefox.driver";
    private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private static final String EDGE_DRIVER_PROPERTY = "webdriver.edge.driver";

    public WebDriverManager() {
        _driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
        _environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
    }

    public WebDriver getDriver() {
        if (_driver == null) _driver = createDriver();
        return _driver;
    }

    private WebDriver createDriver() {
        switch (_environmentType) {
            case LOCAL:
                _driver = createLocalDriver();
                break;
            case REMOTE:
                _driver = createRemoteDriver();
                break;
        }
        return _driver;
    }

    private WebDriver createRemoteDriver() {
        throw new RuntimeException("RemoteWebDriver is not yet implemented");
    }

    private WebDriver createLocalDriver() {
        switch (_driverType) {
            /*case FIREFOX : _driver = new GeckoDriverService();
                break;*/
            case CHROME:
                System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
                _driver = new ChromeDriver();
                break;
            case INTERNETEXPLORER:
                _driver = new InternetExplorerDriver();
                break;
            case EDGE:
                _driver = new EdgeDriver();
                break;
        }

        if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
            _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        return _driver;
    }

    public void closeDriver() {
        _driver.close();
        _driver.quit();
    }
}
