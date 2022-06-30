package TestNGRegression;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicTest {
	
@BeforeTest
	public void setUp() {
		
		System.out.println("Initializing Everything !!!-Regression");
	}
	
	@AfterTest
	public void tearDown() {
		
		System.out.println("Quitting Everything !!!-Regression");
	}

}
