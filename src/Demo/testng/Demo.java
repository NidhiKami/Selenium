package Demo.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void tc_1() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));
	search.sendKeys("java",Keys.ENTER);
	System.out.println("Tc1");
	driver.close();
	}

	@Test
	public void tc_2() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	WebElement search = driver.findElement(By.xpath("//input[@name=\"\"]"));//wrong
	search.sendKeys("java",Keys.ENTER);
	System.out.println("Tc2");
	driver.close();

	}
}