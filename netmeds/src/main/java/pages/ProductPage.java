package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	
	WebDriver driver;
    WebDriverWait wait;
    
    public ProductPage(WebDriver driver)
    {
    	
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    
    By productImage = By.className("product-image"); 
    By price = By.className("price"); 
    By breadcrumb = By.className("breadcrumb"); 
    By availability = By.className("availability"); 
    By addToCartButton = By.id("add-to-cart-button");
    By cartConfirmation = By.className("cart-confirmation");
    
    public boolean isProductImageDisplayed()
    {
    	
    	 WebElement imageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productImage));
    	 return imageElement.isDisplayed();
    }
    
    public boolean isPriceDisplayed()
    {
    	
    	WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(price));
    	 return priceElement.isDisplayed();
    }
    
    public boolean isBreadcrumbDisplayed()
    {
    	 WebElement breadcrumbElement = wait.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb));
    	 return breadcrumbElement.isDisplayed();
    }
    
    public boolean isAvailabilityDisplayed()
    {
    	
    	 WebElement availabilityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(availability));
    	 return availabilityElement.isDisplayed();
    	 
    }
    
    public void addToCart()
    {
    	
    	WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
    	addToCartBtn.click();
    }
    
    public boolean isCartConfirmationDisplayed()
    {
    	
    	WebElement confirmationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartConfirmation));
    	return confirmationElement.isDisplayed();
    }

	public void goToHomePage() {
		
		
	}

	public String checkCartQuantity() {
		
		return null;
	}

	public void navigateToCart() {
		
		
	}

}
