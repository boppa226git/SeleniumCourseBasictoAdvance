package WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class Webdrivermanage  {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
		String str="Edge";
		
		
		// firefoxDriversetup
		if(str.equals("firefox"))
		{
        WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
		}
		
		
		
		else
			if(str.equals("chrome"))
		{
	
	   // chromeDriversetup
        WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		}
		else
		
	    if(str.equals("Edge"))
		{
	     
       	 //Edge Driversetup
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
		   }
		else
	    // InternetExplorerDriversetup
		{
         WebDriverManager.iedriver();
         driver=new InternetExplorerDriver();
		 }
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		}





}

