package Demo.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
	}

	@BeforeTest
	public void bT()
	{
		System.out.println("Before test");
	}
	@BeforeClass
	public void beforeC()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@Test
	public void tc1()
	{
		System.out.println("hi.....from tc1");
	}
	@Test
	public void tc2()
	{
		System.out.println("hi.....from tc2");

	}
	@AfterMethod
	public void afterM()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterC()
	{
		System.out.println("After class");
	}
	@AfterTest
	public void aT()
	{
		System.out.println("After test");
	}
	@AfterSuite
	public void aS()
	{
		System.out.println("After Suite");
	}
}

