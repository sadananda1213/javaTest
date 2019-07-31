package testNG;
import org.testng.annotations.Test;

public class DependsOnMethodTestCase 
{
	@Test(dependsOnMethods="testCase2")
	public void testCase1()
	{
		System.out.println("This is Test Case 1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("This is Test Case 2");
	}

}
