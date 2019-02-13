package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	//Page Factory or Object Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement Signuplink;

	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMlogo()
	{
		return crmlogo.isDisplayed();
	}
	
	public HomePage login (String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginbtn.click();
		TestUtil.clickElementByJavaScript(loginbtn, driver);
		return new HomePage();
	}
	
}
