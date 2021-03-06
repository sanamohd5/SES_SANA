package com.stdentenrollment.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
    public static Properties prop = null;
    String driverPath = "C:\\Users\\DELL\\Desktop\\Driver\\chromedriver.exe";
    
        public static void TestBase() {
        try {
        	prop = new Properties();   //Below line creates an object of Properties called 'prop'
        	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
        	+ "/config.properties");    //creates an object of FileInputStream,'ip' and Gives the path of properties file
        	prop.load(ip);              //Below line of code will load the property file
            } 
        catch (FileNotFoundException e) {
        	e.printStackTrace();
        	} 
        catch (IOException e) {
        	e.printStackTrace();
        	}
        }
      
@BeforeTest
public void onSetup() {
	TestBase();    // for loading the configurations
    String browserName = prop.getProperty("browser");
    
    if (browserName.equals("chrome")) {
    	System.setProperty("webdriver.chrome.driver", driverPath);
    	driver = new ChromeDriver();
    	}
else if (browserName.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", driverPath);
	driver = new FirefoxDriver();
    }
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
    driver.manage().window().maximize();   
    }

@AfterTest
public void quitBrowser() throws IOException {
	driver.quit();
	} 
}




