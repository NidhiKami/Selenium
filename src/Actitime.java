import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Inc.")).click();

		Set<String> wins = driver.getWindowHandles();
		for(String win : wins) 
		{
			driver.switchTo().window(win);
		}
		System.out.println(driver.getTitle());

	}//indexxparth //div/table[1]/tbody[1]/tr[1]/td[2]/b[1]-admin
	////div/table[1]/tbody[1]/tr[2]/td[1]/b[1] -manager
	//tr[3]/td[1]/a[1]- forgotpassword
	////li[4]/a[1]/div[1]/span[1] cart
}

