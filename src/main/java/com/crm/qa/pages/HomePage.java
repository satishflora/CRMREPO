package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	//Page Factory
	//@FindBy(xpath="//td[contains(@class,'logo_text')]")
	@FindBy(css=".logo_text")
	WebElement logo;
	@FindBy(linkText="Help")
	WebElement helplink;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String verifyHomePageLogo()
	{
		return logo.getText();
	}
	
	public String verifyHomePageHelpLinkExist()
	{
		return helplink.getText();
	}
}
