package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	@Test
	public void softAssert()
	{
	
		SoftAssert softAssertion=new SoftAssert();
		System.out.println("SoftAssert method was started");
		softAssertion.assertTrue(false);
    	System.out.println("SoftAssert method was executed");
    	
	}
	@Test
	public void hardAssert()
	{
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	
	}
}
