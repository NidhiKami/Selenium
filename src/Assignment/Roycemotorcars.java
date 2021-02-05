package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roycemotorcars 
{
	
		public static void main(String[] args) throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
			//driver.findElement (By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
}
}
