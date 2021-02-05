
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebook 
{ 
       public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email = driver.findElement (By.id("email"));
	    email.sendKeys("alia");
		WebElement password= driver.findElement (By.id("pass"));
		password.sendKeys("ranbir");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
	}
}

