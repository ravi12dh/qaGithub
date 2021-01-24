package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class VariousElements {

	@Test
	
		
		// public static void main(String[] args) throws InterruptedException {
			//  exploreVariousElements();
		
		
		
	
	public void exploreVariousElements() throws InterruptedException {
		
		//Set chrome driver as your default Driver
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//create an object of chrome driver.. Instantiate or invoke ChromDriver object
		
			WebDriver driver = new ChromeDriver();
			
		

			//maximum Browser
			driver.manage().window().maximize();
			
			//implicit Wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		                                                                            	
			//delete cookies and history
			driver.manage().deleteAllCookies();
			
			
			//go to site
			driver.get("https://www.objectspy.space/");
			
			//click on radio button male.
			driver.findElement(By.id("sex-0")).click();
			Thread.sleep(3000);
			
			//type something in fields.
			driver.findElement(By.name("firstname")).sendKeys("Ruvan");
			Thread.sleep(3000);
			
			//click on link text
//			driver.findElement(By.linkText("Link Test : New Page")).click();
//			Thread.sleep(3000);
			
			//click on partial link
			driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
			Thread.sleep(3000);
			
			//Slow down java 1000 ms = 1s
			Thread.sleep(3000);
			//close the browser
			driver.close();
			//Quit the browser
			driver.quit();
	}




}
