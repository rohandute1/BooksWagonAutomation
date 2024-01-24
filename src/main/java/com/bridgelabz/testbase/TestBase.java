package com.bridgelabz.testbase;

import com.bridgelabz.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties properties;
    public static Logger log = LogManager.getLogger();
    public TestBase(){
        try {
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("E:\\java\\BookswagonAutomation\\src\\main\\java\\com\\bridgelabz\\config\\configFile.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void start_Test_Execution(){
        String selectedBrowser = properties.getProperty("browser");
        if (selectedBrowser.equals("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-notifications");
            driver = new ChromeDriver(chromeOptions);
        } else if (selectedBrowser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get(properties.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
    }
}
