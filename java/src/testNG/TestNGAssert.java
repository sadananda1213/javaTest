package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssert 
{
	@Test
	public void testNGAssert() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		String actualTitle="Gmail";
		Assert.assertEquals(driver.getTitle(),actualTitle);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sadananda100@gmail.com");
		Thread.sleep(3000);
		driver.get("http://www.gmail.com");
	    String actualTitle1="GoogleMail";
	    Assert.assertEquals(driver.getTitle(),actualTitle1);
	}

}
