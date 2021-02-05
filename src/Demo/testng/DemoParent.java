package Demo.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoParent 
	{
		WebDriver  driver;
		@BeforeMethod
		public void beforeM() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		    driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);

		}
		@AfterMethod
		public void afterM()
		{
			driver.close();
		}
	}

