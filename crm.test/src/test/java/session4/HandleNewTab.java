package session4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleNewTab {

	WebDriver driver;
	
	
	@Before
	public void hoverOverTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.yahoo.com/");
	 }
	
	
	@Test
	public void searchForYahooXpath() throws InterruptedException {
		
	By SEARCH_FIELD_LOCATOR = By.cssSelector("input#ybar-sbq");
	By W3_LINK_LOCATOR =By.linkText("XPath Tutorial - W3Schools");
	By SQL_LINK_LOCATOR = By.linkText("SQL");
	
	
	driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("xpath");
	driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER);
	//Thread.sleep(3000);
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(W3_LINK_LOCATOR));
	driver.findElement(W3_LINK_LOCATOR).click();
	//System.out.println(driver.getWindowHandles());
	
	for (String windowHandle:driver.getWindowHandles()) {
		driver.switchTo().window(windowHandle);
		
	  }
	driver.findElement(SQL_LINK_LOCATOR).click();
		
	Thread.sleep(3000);
 }
	
		@After
		public void  closeEverything() {
		driver.close();
		driver.quit();
			
	
		
	

		
	}
}
