
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class XparthGoogle 
	{


		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			WebElement search = driver.findElement (By.xpath("//input[@aria-autocomplete='both']"));
			search.sendKeys("java",Keys.ENTER);//method overloading example
			// driver.findElement (By.name("btnK")).click;
			
		}
	}

