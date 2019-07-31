package testNG;

import org.testng.annotations.Test;

public class TestCase2 
{
	@Test(groups={"Functional Test"})
	public void composeMail()
	{
		System.out.println("Mail sent");
	}

}
