package Popups;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotDemo 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File screenshotsave = new File("./ScreenShot/google.png");
		Files.copy(screenshot, screenshotsave);


	}

	public static void ScreenShot(WebDriver driver, String mName) {
		// TODO Auto-generated method stub
		
	}
}
