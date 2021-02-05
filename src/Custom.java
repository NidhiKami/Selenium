
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Custom {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nanu/Documents/sam1.html");
		new WebDriverWait(driver,10).until(new ExpectedCondition<Boolean>()
		{

			@Override
			public Boolean apply(WebDriver driver)
			{

				return driver.findElement(By.xpath("//div[1]/input[1]")).getAttribute("Name").equals("textA");
			}
		});
		driver.findElement(By.name("textA")).sendKeys("Nidhi");
	}
}





