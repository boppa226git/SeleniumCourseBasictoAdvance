package TestNGTestCases;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class BasicTest {
	
@BeforeTest
	public void setUp() {
		
		System.out.println("Initializing Everything !!!");
	}
	
	@AfterTest
	public void tearDown() {
		
		System.out.println("Quitting Everything !!!");
	}

}
