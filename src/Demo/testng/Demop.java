package Demo.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demop 
{
@Test(dataProvider = "demo",dataProviderClass= DemoReadDataPovider.class)
public void Tc_01(String user,String pass)
{
	//Repoter.log(user +" " +pass,true);

	System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement (By.xpath("//input[contains(@id,'username')]")).sendKeys(user);
	driver.findElement (By.xpath("//input[contains(@name,'pwd')]")).sendKeys(pass,Keys.ENTER);
} 
}