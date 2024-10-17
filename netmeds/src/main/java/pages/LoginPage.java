package pages;
//package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 WebDriver driver;
	 
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 private By mobileNumberField = By.id("loginfirst_mobileno");
	    private By passwordField = By.id("loginpassword");
	    private By loginButton = By.id("loginSubmit");
	    private By errorMessage = By.id("login-error");
	    
	    public void enterMobileNumber(String mobileNumber) {
	        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
	    }
	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }
	    
	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
	    public String getErrorMessage() {
	        return driver.findElement(errorMessage).getText();
	    }
	    public boolean isErrorMessageDisplayed() {
	        return driver.findElement(errorMessage).isDisplayed();
	    }
		public void enterEmail(String string) {
			
			
		}
		public void clickSubmit() {
			
			
		}
	    
	
	

}
