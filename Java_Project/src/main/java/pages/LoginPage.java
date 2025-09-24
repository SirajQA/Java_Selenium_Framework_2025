package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BaseTest {

	private By closeLoginPopupXpath = By.xpath("//*[@class=\'logSprite icClose\']");
	//private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void closeLoginPopup()
	{
	  driver.findElement(closeLoginPopupXpath).click();	
	}
	
	public String getPageTitle()
	{
		String pageTitle =  driver.getTitle();
		return pageTitle;
	}
}
