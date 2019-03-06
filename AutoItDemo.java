package autoIt1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItDemo {
	WebDriver driver;
	@Test
	public void initialSetup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\Geeta\\Desktop\\autoit.html");
		driver.findElement(By.name("resumeupload")).click();
		Runtime.getRuntime().exec("C:\\Users\\Geeta\\Desktop\\autoit\\fileupload.exe");
		driver.quit();
		
	}
	

}
