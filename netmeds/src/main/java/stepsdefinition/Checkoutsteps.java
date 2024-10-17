package stepsdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CartPage;
import org.junit.Assert;

public class Checkoutsteps {
	
	WebDriver driver;
    CartPage cartPage;
    
    @Given("I navigate to the cart page")
    public void i_navigate_to_the_cart_page()
    {
    	WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 driver.get("https://www.netmeds.com/checkout/cart");
    	 driver.manage().window().maximize();
    	 cartPage = new CartPage(driver);
    }
    
    @Then("I should see the product name and price in the cart")
    public void i_should_see_the_product_name_and_price_in_the_cart()
    {
    	String productName = cartPage.getProductName();
    	String productPrice = cartPage.getProductPrice();
    	Assert.assertFalse("Product name is not displayed", productName.isEmpty());
    	 Assert.assertFalse("Product price is not displayed", productPrice.isEmpty());
    	 System.out.println("Product in the cart: " + productName + " with price " + productPrice);
    	 
    }
    
    @And("I update the product quantity to 4 in the dropdown")
    public void i_update_the_product_quantity_to_4_in_the_dropdown()
    {
    	cartPage.updateQuantityToFour();
    	String totalAmount = cartPage.getTotalAmount();
    	 System.out.println("Total amount after updating quantity: " + totalAmount);
    	 
    }
    
    @When("I click on the proceed button")
    public void i_click_on_the_proceed_button()
    {
    	 cartPage.clickProceed();
    }
    
    @Then("I should be redirected to the checkout page")
    public void i_should_be_redirected_to_the_checkout_page() 
    {
    	
    	String expectedCheckoutUrl = "https://www.netmeds.com/checkout/";
    	 String actualUrl = driver.getCurrentUrl();
    	 Assert.assertTrue("Did not navigate to the checkout page", actualUrl.contains(expectedCheckoutUrl));
    	 System.out.println("Redirected to checkout page: " + actualUrl);
    	 driver.quit();
    	 
    }

}
