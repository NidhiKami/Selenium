package Demo.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	//@Test(invocationCount = 5)
	@Test(dependsOnMethods = {"tc2"})//{"tc2","tc3"}//(priority = 3)
	public void tc1()
	{
		Reporter.log("Hey1....!",true);
	}
	@Test//(invocationCount=0)//(enabled = false)//(priority = 1)
	public void tc2()
	{
		Reporter.log("Hey2....!",true);
		//Assert.fail();
	}
	@Test//(priority = -2)
	public void tc3()
	{
		Reporter.log("Hey3....!",true);
	}
}
