import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//software//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement (By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		driver.findElement (By.xpath("//ul[@class=\"featuredLinksBar__linkContainer\"]")).click();
		String I1 = driver.findElement (By.xpath("//h3 [contains(.,'Hadapsar, Pune')]")).getText();
		System.out.println(I1);
		String I2 = driver.findElement (By.xpath("//h3[contains(.,'Bandra, Mumbai')]")).getText();
		System.out.println(I2);
		String I3 = driver.findElement (By.xpath("//h3[contains(.,'Kirti Nagar, New Delhi')]")).getText();
		System.out.println(I3);
		String I4 = driver.findElement (By.xpath("//h3[contains(.,'Domlur, Bangalore')]")).getText();
		System.out.println(I4);
		String I5 = driver.findElement (By.xpath("//h3[contains(.,'JP Nagar, Bangalore')]")).getText();
		System.out.println(I5);
		String I6 = driver.findElement (By.xpath("//h3[contains(.,'Sahakara Nagar, Bangalore')]")).getText();
		System.out.println(I6);
		String I7 = driver.findElement (By.xpath("//h3[contains(.,'Mall Of India, Noida')]")).getText();
		System.out.println(I7);
		String I8 = driver.findElement (By.xpath("//h3[contains(.,'Nungambakkam, Chennai')]")).getText();
		System.out.println(I8);
		String I9 = driver.findElement (By.xpath("//h3[contains(.,'Creaticity, Pune')]")).getText();
		System.out.println(I9);
		String I10 = driver.findElement (By.xpath("//h3[contains(.,'Kondapur, Hyderabad')]")).getText();
		System.out.println(I10);
		
		
	}
}