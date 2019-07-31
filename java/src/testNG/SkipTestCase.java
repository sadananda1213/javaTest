package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase 
{
	@Test
	public void aSkipTest()
	{
		String condition="Skip Test";
		if(condition.equals("Skip Test"))
		{
			throw new SkipException("Skipping-This is not ready for test");
		}
		else
		{
			System.out.println("I am in else condition");
		}
	System.out.println("I am out of if else condition");
	}
@Test
public void nonSkipTest()
{
	System.out.println("No need to skip this test");
}
}
