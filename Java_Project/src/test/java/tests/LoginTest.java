package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest extends BaseTest {

	private LoginPage loginPage;
	private HomePage homepage;
	
	@BeforeTest
	public void updateURL()
	{
		BaseTest.URL  = "https://www.myntra.com/";
		
	}
	
	@Test
	public void navigateToURL()
	{
		
		loginPage = new LoginPage(driver);
		homepage = new HomePage(driver);
		
		
		loginPage.verifyHomePage();
		String PageTitle = loginPage.getPageTitle();
		System.out.println("Page Title: "+PageTitle);
		
		homepage.enterTextToSearch("Watches");
		System.out.println("Page Title: "+PageTitle);
		
	}
	
}
