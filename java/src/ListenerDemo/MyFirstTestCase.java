package ListenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerDemo.ListenerTestNG.class)
public class MyFirstTestCase 
{
	
	@Test
	public void GoogleTitleVerify()
	{
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test
	public void TitleMatch()
	{
		System.out.println("Test Cas2 dummy");
		Assert.assertTrue(false);
	}

}
