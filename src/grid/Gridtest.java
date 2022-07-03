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
			System.out.println("url is "+url);
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 @Parameters({"br"})
		@Test
		public void dis(String br) throws MalformedURLException
	
	{
		 
		RemoteWebDriver driver=null;
		//DesiredCapabilities cap=DesiredCapabilities.firefox();
		
		
		
		
		//nodeUrl = "https://192.168.0.178:4444/wd/hub";
		nodeUrl="http://localhost:4444/wd/hub";
		 //DesiredCapabilities cap = DesiredCapabilities.chrome();
		DesiredCapabilities cap = new DesiredCapabilities();
		System.out.println("====");
		 cap.setBrowserName(br);
		 cap.setPlatform(Platform.WINDOWS);
		 driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		//cap.setBrowserName("firefox");
		//cap.setPlatform(Platform.XP);
		//RemoteWebDriver driver=new RemoteWebDriver(new    URL("http://192.168.0.178:4444/wb/hub"), cap);
        driver.navigate().to("http://gmail.com");
        //driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
        //driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
        driver.close();
	}
	@Test
	public void emp()
	{
		System.out.println("second method");
	}

}
