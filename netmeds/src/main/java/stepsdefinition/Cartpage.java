package stepsdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ProductPage;
import org.junit.Assert;

public class Cartpage {
	
	 WebDriver driver;
	    ProductPage productPage;
	    
	    @Given("I navigate to {string}")
	    public void i_navigate_to(String url)
	    {
	    	 WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
	         driver.get(url);
	         driver.manage().window().maximize();
	         productPage = new ProductPage(driver);
	         
	    }
	    
	    @When("I add the product to the cart")
	    public void i_add_the_product_to_the_cart()
	    {
	    	productPage.addToCart();
	    }
	    
	    @Then("I should navigate to the home page")
	    public void i_should_navigate_to_the_home_page()
	    {
	    	productPage.goToHomePage();
	    }
	    
	    @Then("the cart icon should display the product with the correct quantity")
	    public void the_cart_icon_should_display_the_product_with_the_correct_quantity() 
	    {
	    	 String cartQuantity = productPage.checkCartQuantity();
	    	 Assert.assertEquals("1", cartQuantity); 
	    }
	    
	    @When("I click on the cart icon")
	    public void i_click_on_the_cart_icon()
	    {
	    	 productPage.navigateToCart();
	    }
	    
	    @Then("I should be redirected to the cart page")
	    
	    public void i_should_be_redirected_to_the_cart_page()
	    {
	    	
	    	 String expectedCartUrl = "https://www.netmeds.com/cart";
	         String actualCartUrl = driver.getCurrentUrl();
	         Assert.assertEquals(expectedCartUrl, actualCartUrl);
	    }

}
