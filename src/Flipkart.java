import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement (By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		List<WebElement> name =driver.findElements(By.xpath("//span[@class=\"_2I9KP_\"]"));
		for(WebElement menuname :name)
		{
			System.out.println(menuname.getText());
		}
	}
}