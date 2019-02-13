package com.crm.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;
    
   public static void clickElementByJavaScript(WebElement element, WebDriver driver)
   {
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();", element);
   }
   
   public static void switchToFrame()
   {
	   driver.switchTo().frame("mainpanel");
   }

}
