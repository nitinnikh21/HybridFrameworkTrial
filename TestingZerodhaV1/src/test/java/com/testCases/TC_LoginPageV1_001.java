package com.testCases;


import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObject.LoginPage;

public class TC_LoginPageV1_001 extends BaseClass {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get(url);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		lp.EnterUserId(UserName);
		logger.info("Username entered");
		
		lp.EnterPassword(Password);
		logger.info("password entered");
		
		lp.ClickSubmit();
		lp.EnterPin(Pin);
		logger.info("pin entered");
		lp.ClickSubmit();
		
		if(driver.getTitle().equals(title)) {
			Assert.assertTrue(true);
			logger.info("Login test case passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login test case failed");
		}
	}
}
