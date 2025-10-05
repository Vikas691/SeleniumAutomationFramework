package test;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import jdk.internal.org.jline.utils.Log;
import pages.LoginPage;

public class LoginTest extends baseTest {

	@Test
	public void testValidLogin() {
		Log.info("Starting Login test..");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername("standard_user");
		loginpage.enterPass("secret_sauce");
		loginpage.clickLogin();
		
		System.out.println("title of the page is "+driver.getTitle());
		Log.info("Verfying page title");
Assert.assertEquals(driver.getTitle(), "Swag Labs...");
	}
	
}
