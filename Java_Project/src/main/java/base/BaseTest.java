package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;
	public static String URL;
	
	@BeforeMethod
	public void setup()
	{	
		driver  = new ChromeDriver();
		driver.navigate().to(URL);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		if(driver != null)
		{
			driver.quit();
		}
	}
	
}
