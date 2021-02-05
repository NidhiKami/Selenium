package Demo.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoChild extends DemoParent
{
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
}
