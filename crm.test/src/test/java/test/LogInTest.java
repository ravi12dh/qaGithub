package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
	
	
	@Test
	public void handleCSSelements() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://techfios.com/billing/?ng=admin/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demo@techfios.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			
			
			//driver.close();
			//driver.quit();
	}
		
	
		
		
		
		
		
	}

