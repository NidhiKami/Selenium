import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a = new Actions(driver);
		//a.contextClick(ele).perform();
		a.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
}
	
}
