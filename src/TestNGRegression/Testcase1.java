package TestNGRegression;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testcase1 {

	
	
	
	@BeforeTest
	public void createDBConn() {
		
		System.out.println("Creating db conn-Regression");
	}
	
	@AfterTest
	public void closeDBConn() {
		
		System.out.println("Closing DB Conn-Regression");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		
		System.out.println("Launching browser-Regression");
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closing the browser-Regression");
	}
	
	@Test(priority=1,groups= {"functional","smoke"})
	public void doUserReg() {
		
	
		System.out.println("Executing User Reg test-Regression");
		
	}
	
	@Test(priority=2,groups= {"functional","smoke"})
	public void doLogin() {
	
		System.out.println("Executing login test-Regression");
		
	}
	
}
