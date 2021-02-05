package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Complete {
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(new ExpectedCondition<Boolean>()
		{

			@Override
			public Boolean apply(WebDriver driver)
			{
				JavascriptExecutor js =(JavascriptExecutor)driver;
				System.out.println(js.executeScript("retun document.readyState").toString());
				boolean pg1 = js.executeScript("retun document.readyState").toString().equals("complete");
				return pg1;
			}
		});
		driver.findElement (By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		driver.findElement (By.xpath("//input[contains(@name,'pwd')]")).sendKeys("managar",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'addTaskButtonId')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class=\"customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(.,'- New Customer -')]/parent::div[@class=\"searchItmList\"]")).click();
	}
}
