package WebdriverAdvancedFeaturesSection18;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverEvent {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.findElement(By.name("q")).sendKeys("way2automation");
		driver.findElement(By.xpath("//div[@class='CqAVzb lJ9FBc']//input[@name='btnK']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/div/cite"))).click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div/center/input[1]"))).click();
		
		//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/a/h3")).click();
		
		WebElement menu = driver.findElement(By.xpath("//li[@id='menu-item-27617']//span[@class='menu-text'][normalize-space()='Resources']"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		//WebDriverWait wait1 = new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//li[@id='menu-item-27618']//span[@class='menu-text'][normalize-space()='Practice Site 1']")).click();
		//driver.findElement(By.linkText("Practice site 1")).click(); 
		Thread.sleep(2000);
		driver.quit();
	}

}