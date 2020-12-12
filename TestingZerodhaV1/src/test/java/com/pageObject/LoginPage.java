package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement enterUserId;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement enterPassword;
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement enterPin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	
	public void EnterUserId(String UserName)
		{
		enterUserId.sendKeys(UserName);
		}
	
	public void EnterPassword(String Password)
		{
		enterUserId.sendKeys(Password);
		}
	
	public void EnterPin(String Pin)
		{
		enterUserId.sendKeys(Pin);
		}
	
	public void ClickSubmit()
		{
		submit.click();
		}
	}

