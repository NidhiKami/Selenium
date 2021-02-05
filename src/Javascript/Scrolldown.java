package Javascript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*
			js.executeScript("window.scrollBy(0,1000)");//scroll down
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-500)");//scroll up

			js.executeScript("window.scrollBy(300,0)");//scroll right
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(-200,0)");//scroll left

			js.executeScript("window.scrollBy(0,document.body.scollHeight)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-document.body.scollHeight)");
		 */
		WebElement sfh = driver.findElement(By.xpath("//h2[contains(.,'Stand for Handmade')]"));
		js.executeScript("arguments[0].scrollIntoView()",sfh);
	}
}
//div[@id="gw-card-layout"]

