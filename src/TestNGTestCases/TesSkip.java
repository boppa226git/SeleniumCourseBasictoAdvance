package TestNGTestCases;
import org.testng.SkipException;
import org.testng.annotations.Test;
public class TesSkip {
	@Test
	public void isSkip() {
		
		throw new SkipException("Skipping the test as the condition is not met");
	}

}
