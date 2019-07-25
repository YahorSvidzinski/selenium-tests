package config;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class WebDriverSingleton {

    private static WebDriverSingleton instance = null;
    private WebDriver driver;

    public WebDriver openBrowser() {
        Capabilities capabilities = DesiredCapabilities.chrome();
        driver = new ChromeDriver(capabilities);
        System.setProperty("webdriver.chrome.driver", findFile("chromedriver"));
        return driver;
    }

    static private String findFile(String filename) {
        String[] paths = {"", "bin/", "target/classes"};
        for (String path : paths) {
            if (new File(path + filename).exists())
                return path + filename;
        }
        return "";
    }

    public static WebDriverSingleton getInstance() {
        if (instance == null) {
            instance = new WebDriverSingleton();
        }
        return instance;
    }
    
}
