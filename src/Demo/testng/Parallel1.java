package Demo.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 
{
	public class Parallel2 
	{
		@Test
		public void TC2() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
			driver.close();
		}
	}

}
