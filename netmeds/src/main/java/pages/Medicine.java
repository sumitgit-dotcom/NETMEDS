package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Medicine {
	
	WebDriver driver;
     
	public Medicine(WebDriver driver) {
        this.driver = driver;
    }
	
	 By loginButton = By.id("login-btn");
	    By emailField = By.id("login_email");
	    By passwordField = By.id("login_password");
	    By submitButton = By.xpath("//button[@type='submit']");
	    
	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
	    
	    public void enterEmail(String email) {
	        driver.findElement(emailField).sendKeys(email);
	    }
	    
	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }
	    
	    public void clickSubmit() {
	        driver.findElement(submitButton).click();
	    }

		public void clickMedicinesMenu() {
			
			
		}

		public void clickAllMedicines() {
			
			
		}

		public void searchForMedicine(String searchTerm) {
			
			
		}

		public void selectPacimol() {
			
			
		}
	
	

}
