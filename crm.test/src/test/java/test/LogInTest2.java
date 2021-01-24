package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LogInTest2 {



	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://techfios.com/test/billing/?ng=login/");
			driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[contains(@placeholder, 'assword') and contains(@class, 'form-')]")).sendKeys("abc123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Sign') and @name='login']")).click();
			Thread.sleep(3000);
			
			String DashboardTitleXpath = "//div[@id='page-wrapper']//descendant::h2[contains(text(), 'Dashboa')]";
			
			//Explicit wait
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DashboardTitleXpath)));
			
			//new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DashboardTitleXpath)));
			
			String expectedTitle = "Dashboard- TechFios Test Application - Billing";
			String actualTitle = driver.getTitle();	
			
			Assert.assertEquals("Dashboard page did not display!", expectedTitle, actualTitle);
		
			driver.close();
			driver.quit();
	}
		
	
		
		
		
		
		
	}






