package WebdriverAdvancedFeaturesSection18;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsandPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		 WebDriverManager.edgedriver().setup();
	       WebDriver driver=new EdgeDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.switchTo().alert().dismiss();
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//Alert alert = wait.until(ExpectedConditions.alertIsPresent());

//System.out.println(alert.getText());
//alert.accept();
		System.out.println("----Generating window ids from first window----");
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();

		String first_window = iterate.next();
		System.out.println(first_window);

		driver.findElement(By.id("loginsubmit")).click();

		// 2nd window

		
		System.out.println("----Generating window ids from Second window----");

		winids = driver.getWindowHandles();
		iterate = winids.iterator();

		System.out.println(iterate.next()); // first window
		String second_window = iterate.next(); // second window
		System.out.println(second_window);

		driver.switchTo().window(second_window);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[3]/a")).click();

		// 3rd window

		System.out.println("----Generating window ids from third window----");

		winids = driver.getWindowHandles();
		iterate = winids.iterator();

		System.out.println(iterate.next()); // first window
		System.out.println(iterate.next()); // second window
		
		String third_window = iterate.next(); //3rd window
		

		System.out.println(third_window);
		driver.switchTo().window(third_window);
		
		System.out.println(driver.getTitle().contains("JetPrivilege HDFC Bank Signature"));

	
		
		driver.quit();

	}

}
