package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverOver {

	
	@Test
	public void hoverOverTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.dell.com/en-us");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement DEALS_MENU_ELEMENT =driver.findElement(By.xpath("//button[@id='l5']"));
		//WebElement WORKSTATION_DEALS_ELEMENT = driver.findElement(By.linkText("Gaming PC Deals"));
		
		
		action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
		Thread.sleep(4000);
		WebElement WORKSTATION_DEALS_ELEMENT = driver.findElement(By.linkText("Gaming PC Deals"));
		WORKSTATION_DEALS_ELEMENT.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
