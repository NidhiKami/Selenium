
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	public class Sam1 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Nanu/Documents/sam1.html");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement (By.xpath("//input[@name=\"textA\"]")).sendKeys("Name");
			WebDriverWait ww = new WebDriverWait(driver,10);
			ww.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//input[@name=\"textA\"]"),"Name"));
	
			driver.findElement(By.xpath("//input[@name=\"textB\"]")).sendKeys("Nidhi");
		}
	}


