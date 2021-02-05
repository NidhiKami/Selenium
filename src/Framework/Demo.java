package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@id=\"gsc-i-id1\"]"));
		search.sendKeys("java",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(2000);
		search.sendKeys("TestNG",Keys.ENTER);
}
}
