package testNG;

import org.testng.annotations.Test;

public class DependsOnMethodTestCase1 
{
	@Test(groups={"FirstGroup"})
	public void testCase3()
	{
		System.out.println("This Test Case 3");
	}
	@Test(groups={"SecondGroup"})
	public void testCase4()
	{
		System.out.println("This is Test Case 4");
	}

}
