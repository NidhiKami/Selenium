package Org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.pom.SeleniumHome;

public class TestSeleniumHome {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		SeleniumHome sh = new SeleniumHome(driver);
		sh.sendText("Java");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		sh.sendText("TestNg");
		driver.close();
	}
}
