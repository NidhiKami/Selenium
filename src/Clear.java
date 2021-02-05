import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		search.sendKeys("java",Keys.ENTER);
		WebElement value = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		System.out.println(value.getAttribute("value"));
		value.clear();
		driver.findElement(By.xpath("//input[@aria-label=\"Search\"]")).sendKeys("TestNg",Keys.ENTER);


	}
}
