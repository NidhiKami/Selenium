package Popups;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("btnLogin")).click();
	   // Alert a =driver.switchTo().alert();
		//System.out.println(a.getText());
		//a.accept();


	}

		
	}

	