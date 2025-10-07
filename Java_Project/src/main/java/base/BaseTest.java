package base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;
	public static String URL;
	private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	@BeforeMethod
	public void setup()
	{	
		driver  = new ChromeDriver();
		driver.navigate().to(URL);
		waitForPageToLoad();
		
	}
		
	public void waitForPageToLoad() {
		//WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("return document.readyState").equals("complete");
		//waits.until(js.executeScript("return document.readyState").equals("complete"));
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
