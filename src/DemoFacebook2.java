import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebook2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		
	        driver.findElement(By.xpath("//div[@class=\"_6luv _52jv\"]")).click();
		/*
		  System.out.println(create.isEnable());
		if(createnewac.isEnabled());
		createnewac.click();
		*/
		
	}
}
