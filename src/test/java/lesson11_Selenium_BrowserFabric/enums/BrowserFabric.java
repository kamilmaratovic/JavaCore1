package lesson11_Selenium_BrowserFabric.enums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;
//import org.seleniumhq.selenium.opera.OperaDriver;

public class BrowserFabric {

    public static WebDriver getWebdriver(BrowserType browserType){
        switch (browserType){
            case OPERA:
                return getOperaDriver();
            case EDGE:
                return getEdgeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                return getChromeDriver();

        }
    }

    private static WebDriver getOperaDriver() {
        System.setProperty("webdriver.opera.driver", "operadriver");
        return new OperaDriver();
    }

    private static WebDriver getEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        System.setProperty("webdriver.edge.driver", "msedgedriver");
        return new EdgeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
       return new ChromeDriver(options);
    }

}
