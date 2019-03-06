package autoIt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoitDownload {
	WebDriver driver;
	@Test
	public void initialSetup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("F:\\autoitPractice\\InetGet.practice.exe");
		Thread.sleep(5000);
		driver.quit();
	}
}
	
