package com.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utilities.ReadConfig;

public class BaseClass {
//	public String url= "https://kite.zerodha.com/";				//Hard coded variable
//	public String UserName="DV1510";
//	public String Password = "Vijay@123";
//	public String Pin = "959594";
//	public String title = "Kite - Zerodha's fast and elegant flagship trading platform";
	
	
	ReadConfig rc = new ReadConfig();						// Object of ReadConfig class
	public String url= rc.getUrl();							// To get variable dynamically
	public String UserName= rc.getUserName();
	public String Password = rc.getPassword();
	public String Pin = rc.getPin();
	public String title =rc.gettitle();
	
	public WebDriver driver;
	public Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void set(String br) {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nitin\\eclipse-workspace\\TestingZerodhaV1\\Drivers\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Drivers\\chromedriver.exe");			//this will also work the same
//		System.setProperty("webdriver.chrome.driver", rc.getChromePath());							//this will also works the same
//		System.setProperty("webdriver.gecko.driver", rc.getfireFoxPath());
		
		logger = Logger.getLogger("TestingZerodhaV1");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", rc.getchromePath());
		driver = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", rc.getfireFoxPath());
		driver = new FirefoxDriver();
		}
//		else if(br.equals("ie")) {
//			System.setProperty("webdriver.ie.driver", rc.getIEPath());
//			driver = new InternetExplorerDriver();	
//		}
			
	}
	
	@AfterClass
	public void closeBrowser() {
	driver.quit();
	}
}
