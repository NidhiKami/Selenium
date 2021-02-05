package Org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Urbanladder
{

	@FindBy(xpath="//a[@class=\"close-reveal-modal hide-mobile\"]")
	private WebElement close;
	

	@FindBy(xpath= "//li[@class=\"topnav_item livingunit\"]")
	private WebElement Living;
	
	@FindBy(xpath= "//span[contains(.,'Fabric Sofa Sets')]")
	private WebElement Fabricsofa;
	
	public void Livingmouseover(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(Living).perform();
	}
	

	
	public void CloseClick() 
	{
	close.click();
		
	}

	public Urbanladder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public void fabricsofaClick()
	{
		Fabricsofa.click();
	}

	
	
}

	


