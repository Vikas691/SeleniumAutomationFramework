package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import jdk.internal.org.jline.utils.Log;

import utils.log;

public class baseTest {

	protected WebDriver driver;
		

	@BeforeMethod
	public void setup() {
		
		Log.info("Starting Webdriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Log.info("Navigating to url.....");
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void teardown() {
		if(driver!= null) {
			log.info("Closing browser");
			driver.quit();
		}
		
	}



	

}
