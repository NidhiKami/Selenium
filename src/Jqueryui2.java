
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Jqueryui2
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			Thread.sleep(10000);
			
			//WebElement f = driver.findElement(By.xpath("//iframe[@class="demo-frame"]"));
			//driver.switchTo().frame(f);
			//Thread.sleep(10000);
			//WebElement ele =  driver.findElement(By.xpath("//div[@id="droppable"]"));
			//Actions a = new Actions(driver);
			//a.dragAndDropBy(ele,150,0).build().perform();
			
		}

	}

