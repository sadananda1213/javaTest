package testNG;

import org.testng.annotations.Test;

public class TestCase4 
{
	@Test(enabled=false)
	public void printClass2()
	{
		System.out.println("This is Test Case 2");
	}

}
