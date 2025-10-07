package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BaseTest {

	private By closeLoginPopupXpath = By.xpath("//*[@class=\'logSprite icClose\']");
	String search_xpath_STR = "//*[contains(@placeholder,'Search for products')]";
	private By search_xpath = By.xpath(search_xpath_STR);
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	public void closeLoginPopup()
//	{
//	  //List<Webe>  driver. findElements(closeLoginPopupXpath); 	
//	}
	
	public String getPageTitle()
	{
		waitForPageToLoad();
		String pageTitle =  driver.getTitle();
		return pageTitle;
	}
	
	public void verifyHomePage() {
		try
		{
			Thread.sleep(8000);
			driver.findElement(search_xpath); 
		}
		catch(Exception ex)
		{
			System.out.println("Unable to navigate to homepage, exception: "+ex);
		}
		  
	}
	
	
}
