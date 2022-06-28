package TestNGParameterizationDataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data=new Object[3][2];
		data[0][0]="user1";
		data[0][1]="user1password";
		data[1][0]="user2";
		data[1][1]="user2password";
		data[2][0]="user3";
		data[2][1]="user3password";
		return data;
	}
	
	
	@Test(dataProvider="getdata")
	public void LoginCredentials(String userName, String password)
	{
		System.out.println("user details    "+userName+"     and    ");
	}
	
}
