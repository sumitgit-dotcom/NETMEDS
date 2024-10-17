package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriver driver;
    WebDriverWait wait;
    
    By productName = By.xpath("//div[@class='cart-product-name']");
    By productPrice = By.xpath("//div[@class='cart-product-price']");
    By quantityDropdown = By.xpath("//select[@class='quantity-dropdown']");
    By proceedButton = By.id("proceed-to-checkout");
    By totalAmount = By.xpath("//div[@class='total-amount']"); 
    
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    
    public String getProductName()
    {
    	WebElement productNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        return productNameElement.getText();
    }
    
    public String getProductPrice()
    {
    	WebElement productPriceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice));
        return productPriceElement.getText();
    }
    
    public String getTotalAmount() 
    {
    	WebElement totalAmountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(totalAmount));
        return totalAmountElement.getText();
    }
    
    public void updateQuantityToFour()
    {
    	 WebElement quantityDropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(quantityDropdown));
    	 Select dropdown = new Select(quantityDropdownElement);
    	 dropdown.selectByVisibleText("4");
    }
    
    public void clickProceed()
    {
    	WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(proceedButton));
        proceedBtn.click();
    }

}
