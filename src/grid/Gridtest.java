package grid;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridtest {
	static WebDriver driver;
	 static String nodeUrl;
	 
	 @Parameters({"br"})
		@Test
		public void geturl(String url)
		{
			System.out.println("browser is "+url);
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 @Parameters({"br"})
		@Test
		public void dis(String br) throws MalformedURLException
	
	{
		 RemoteWebDriver driver=null;
		 DesiredCapabilities cap=null;
			nodeUrl="http://localhost:4444/wd/hub";
			
	
		 if(br.equalsIgnoreCase("chrome"))
		 {
			 System.out.println("browse type is chrome ----> :"+br);
		// DesiredCapabilities
			 cap = DesiredCapabilities.chrome();
	// cap = new DesiredCapabilities();
		 cap.setBrowserName(br);
		 cap.setPlatform(Platform.WINDOWS);
		 //driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		 }
		 if(br.equalsIgnoreCase("firefox"))
		 {System.out.println("browse type is firefox ----> :"+br);
			 //DesiredCapabilities cap = DesiredCapabilities.firefox();
				 //cap = new DesiredCapabilities();
				 //cap.setBrowserName("firefox");
				// cap.setPlatform(Platform.WINDOWS);
				 cap = DesiredCapabilities.firefox();
			        cap.setBrowserName("firefox"); 
			        cap.setPlatform(Platform.ANY);
				 
				
				// driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		 }
		 
		 driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		 driver.navigate().to("http://gmail.com");
         driver.close();
	}
	

}
