package TestNGParameterizationDataprovider;
import org.testng.annotations.Test;
public class NewLoginTest extends DataProviders  {
	@Test(priority=1,dataProvider="dp1")
	public void testLogin(String username,String password){
		
		System.out.println(username+"----"+password);
		
		
	}
	
	
	@Test(priority=2,dataProvider="dp2")
	public void testUserReg(String fName,String lName){
		
		System.out.println(fName+"----"+lName);
		
		
	}
	

}
