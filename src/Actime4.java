import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actime4 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println(username.getText());
		WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println(password.getText());
		driver.findElement (By.xpath("//input[contains(@id,'username')]")).sendKeys(username.getText());
		driver.findElement (By.xpath("//input[contains(@name,'pwd')]")).sendKeys(password.getText());
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.titleContains("Enter"));
		driver.findElement(By.xpath("//a[@id=\"logoutLink\"]")).click();
		//hii...
	}
}
