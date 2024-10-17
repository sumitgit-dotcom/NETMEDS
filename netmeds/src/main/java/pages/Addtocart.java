package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {
	
	WebDriver driver;
    WebDriverWait wait;
    
    
        
        By addToCartButton = By.id("add-to-cart-button");
        By cartIcon = By.xpath("//div[@class='cart-icon']");
        By cartProductQuantity = By.xpath("//span[@class='cart-quantity']");
        By cartButton = By.xpath("//a[@href='/cart']");
        
        public Addtocart(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, 10);
            
        }
    
        
        public void addToCart() {
            WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
            addToCartBtn.click();
        }
        public void goToHomePage() {
            driver.get("https://www.netmeds.com/");
        }
        
        public String checkCartQuantity() {
            Actions action = new Actions(driver);
            WebElement cartIconElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartIcon)); // Correct method used here
            action.moveToElement(cartIconElement).perform();
            WebElement quantityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartProductQuantity));
            return quantityElement.getText();
        }
        
        public void navigateToCart() {
            WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(cartButton)); // Use the correct locator here
            cartBtn.click();
        }
        
        

}
