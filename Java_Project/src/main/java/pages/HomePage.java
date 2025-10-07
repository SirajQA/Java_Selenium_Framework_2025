package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class HomePage extends BaseTest {

	String search_xpath_STR = "//*[contains(@placeholder,'Search for products')]";
	private By search_xpath = By.xpath(search_xpath_STR);

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterTextToSearch(String text) {
		waitForPageToLoad();
		driver.findElement(search_xpath).sendKeys(text + Keys.ENTER);

	}

}