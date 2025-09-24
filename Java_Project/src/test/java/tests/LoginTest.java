package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;


public class LoginTest extends BaseTest {

	
	
	@BeforeTest
	public void updateURL()
	{
		BaseTest.URL  = "https://www.goibibo.com/";
		
	}
	
	@Test
	public void navigateToURL()
	{
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.closeLoginPopup();
		String PageTitle = loginPage.getPageTitle();
		
		System.out.println("Page Title: "+PageTitle);
		
	}
	
}
