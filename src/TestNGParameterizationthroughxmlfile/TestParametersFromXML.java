package TestNGParameterizationthroughxmlfile;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestParametersFromXML {
	@Parameters({"URL"})
	@Test
	public void geturl(String url)
	{
		System.out.println("url is "+url);
	}
}
