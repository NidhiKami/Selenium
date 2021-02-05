import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2 

{
	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		List<WebElement> a = driver.findElements(By.xpath("//a[@title=\"Jewellery\"]"));
		Actions b = new Actions(driver);
		for(WebElement c :a)
		{
			b.moveToElement(c).build().perform();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id=\"pid_8994\"]/parent::div[@class=\"p-image\"]")).click();
		Set<String>winshandel =driver.getWindowHandles();
		for(String win:winshandel)
		{
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("//span[@class=\"icon-ion-android-arrow-dropdown\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"size\"]/parent::li[@data-key=\"04\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"buy-now\"]")).click();

		WebElement title =driver.findElement(By.xpath("//a[@title=\"The Udith Kada For Him\"]"));
		System.out.println(title.getText());
	}
}
