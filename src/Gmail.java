import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Sign in")).click();
			Set<String> wins = driver.getWindowHandles();
			for(String win : wins) 
			{
				driver.switchTo().window(win);
			}
			System.out.println(driver.getTitle());
			
			WebElement email = driver.findElement (By.id("identifierId"));
		    email.sendKeys("nidhikami@gmail.com");
		    driver.findElement(By.id("identifierNext")).click();
		    //email.sendKeys("");
		    
}
}
