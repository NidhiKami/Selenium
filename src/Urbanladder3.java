import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder3 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement (By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		List<WebElement> name =driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		Actions a = new Actions(driver);
		Thread.sleep(10000);
		for(WebElement menuname :name)
		{
			String mName = menuname.getText();
			System.out.println(mName);
			a.moveToElement(menuname).perform();
			Thread.sleep(10000);
			List<WebElement> submenues = driver.findElements(By.xpath("span[contains(.,'+Name')]/parent::li/descendant::li"));
			
	}
		//span[contains(.,'Sale')]/parent::li/descendant::li


}
}
