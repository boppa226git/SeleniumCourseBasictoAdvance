package WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Webdrivermanage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = null;
        String str = "firefox";


        // firefoxDriversetup
        if (str.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (str.equals("chrome")) {

            // chromeDriversetup
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (str.equals("Edge")) {

            //Edge Driversetup
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else
        // InternetExplorerDriversetup
        {
            WebDriverManager.iedriver();
            driver = new InternetExplorerDriver();
        }

        driver.get("http://cv-library.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }


}

