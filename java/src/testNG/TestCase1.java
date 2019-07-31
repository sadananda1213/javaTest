package testNG;

import org.testng.annotations.Test;

public class TestCase1 
{
	@Test(groups={"Sanity Test","Functional Test"})
	public void loginTest()
	{
		System.out.println("Logged in Successfully");
	}

}
