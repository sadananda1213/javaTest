package testNG;

import org.testng.annotations.Test;

public class TestNGException 
{
	@Test(expectedExceptions=ArithmeticException.class)
	public void testException()
	{
		System.out.println("SoftwareTesting Material");
		int i=1/0;
	}

}
