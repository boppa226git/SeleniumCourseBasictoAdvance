package WebdriverAdvancedFeaturesSection18;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).click();
		Thread.sleep(3000);
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
