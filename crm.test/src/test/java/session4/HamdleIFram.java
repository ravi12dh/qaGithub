package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HamdleIFram {
	
	
	@Test
	public void HandleIFrame() throws InterruptedException{
		

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(3000);
		//System.out.println(driver.findElements(By.tagName("frame")).size());
	//	System.out.println(	driver.findElements(By.tagName("iframe")).size());
		
		
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("java.applet")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("AudioClip")).click();
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();


	}

}
