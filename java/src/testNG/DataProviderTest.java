package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@Test(dataProvider="getData")
	public void loginTest(String Uid,String Pwd)
	{
		System.out.println("UserName is:"+Uid);
		System.out.println("Passswordis:"+Pwd);
	}
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		Object[][]data=new Object[3][2];
		data[0][0]="First Uid";
		data[0][1]="First Pwd";
		
		data[1][0]="Second Uid";
		data[1][1]="Second Pwd";
		
		data[2][0]="user id";
		data[2][1]="passWord";
		
		
		return data;
	}

}
