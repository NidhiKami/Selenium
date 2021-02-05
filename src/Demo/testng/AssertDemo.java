package Demo.testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo 
{
@Test
public void tc() 
{
	String st1 = "ABC";//actual
	String st2 = "ABC";//expected
	Assert.assertEquals(st1,st2);
	Reporter.log("Matched",true);
	
 List<Object> st3= new ArrayList<>();
	st3.add(true);
	st3.add(99);
	st3.add(55.6);
	List<Object> st4 = new ArrayList<>();
	st4.add(true);
	st4.add(99);
	st4.add(55.6);
	Assert.assertEquals(st3,st4);
	Reporter.log("Matched",true);
	
	
	SoftAssert sa  = new SoftAssert();
	sa.assertEquals("ABC", "ABC");
	Reporter.log("Matchedsa",true);
	sa.assertAll();
	Assert.fail();
}
}
