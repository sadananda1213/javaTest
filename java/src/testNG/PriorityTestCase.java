package testNG;

import org.testng.annotations.Test;

public class PriorityTestCase 
{
	@Test(priority=0)
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	@Test(priority=1)
	public void testCase2()
	{
		System.out.println("Test case 2");
	}

}
