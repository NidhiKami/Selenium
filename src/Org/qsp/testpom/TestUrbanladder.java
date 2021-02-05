package Org.qsp.testpom;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.pom.Urbanladder;

public class TestUrbanladder
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		Urbanladder Ur = new Urbanladder(driver);
		Thread.sleep(1000);
		Ur.CloseClick();
		Ur.Livingmouseover(driver);
		Ur.fabricsofaClick();

	}
}
