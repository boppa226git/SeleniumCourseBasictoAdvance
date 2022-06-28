package TestNGParameterizationDataprovider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class DataProviders {
	
	@DataProvider(name="dp1")
	
		public  Object[][] dp1(){
		{
		Object [][] data=new Object[2][2];
		data[0][0] = "raman";
		data[0][1] = "sdfdsfdilf";
		data[1][0] = "Rahul";
		data[1][1] = "asdfhsdlkfjls";
		
		return data;
		}
	}
		@DataProvider(name="dp2")
		public static Object[][] dp2(){
			{
			Object [][] data1=new Object[2][2];
			data1[0][0] = "raman";
			data1[0][1] = "sdfdsfdilf";
			
			data1[1][0] = "Rahul";
			data1[1][1] = "asdfhsdlkfjls";
			return data1;
			}
		
	}
	
}