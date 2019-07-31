package javapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String x=driver.getTitle();
        System.out.println(x);
		

	}

}
