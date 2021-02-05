package Demo.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 
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
	@Test
	public void tc_1() throws InterruptedException 
	{
		WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("Tc1");

	}

	@Test
	public void tc_2() throws InterruptedException 
	{
		WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));//wrong
		search.sendKeys("TestNg",Keys.ENTER);
		System.out.println("Tc2");


	}
	@AfterMethod
	public void afterM()
	{
		driver.close();
	}
}
