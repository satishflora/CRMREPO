package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageLogoTest()
	{
		TestUtil.switchToFrame();
		String logoText = homePage.verifyHomePageLogo();
		Assert.assertEquals(logoText, "CRMPRO");
		
	}
	@Test(priority=2)
	public void verifyHomePageHelpLinkExistTest()
	{
		TestUtil.switchToFrame();
		String helpLinkText = homePage.verifyHomePageHelpLinkExist();
		Assert.assertEquals(helpLinkText.trim(), "Help");
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
