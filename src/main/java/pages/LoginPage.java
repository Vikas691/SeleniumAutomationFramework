package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By usernameTextBox = By.id("user-name");
	private By passwordTextBox = By.id("password");
	private By LoginButton = By.id("login-button");

	
	public LoginPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(usernameTextBox).sendKeys(username);
	}
public void enterPass(String password) {
		
		driver.findElement(passwordTextBox).sendKeys(password);
	}		
		
	
public void clickLogin() {
	
	driver.findElement(LoginButton).click();
	
}
	
}
