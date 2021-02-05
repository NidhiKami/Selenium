import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone 
{
public static void main (String []args)
{
	System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	driver.findElement (By.xpath("//input[contains(@name,'search_query')]")).sendKeys("Diamond Ring");
	driver.findElement(By.xpath("//input[contains(@name,'submit_search')]")).click();
	driver.findElement(By.xpath("//img[contains(@alt,'The Karika statement Ring')]")).click();
	WebElement Buy = driver.findElement (By.xpath("//input[contains(@id,'buy-now')]"));
	System.out.println(Buy.getText());
	
	//driver.findElement(By.xpath("//input[contains(@id,'buy-now')]")).click();
}
}
