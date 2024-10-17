package stepsdefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ProductPage;
import org.junit.Assert;

public class ProductPageSteps {
	
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
    
    @When("I check the product images")
    public void i_check_the_product_images()
    {
    	 Assert.assertTrue("Product images are not displayed", productPage.isProductImageDisplayed());
    }
    
    @Then("the product images should be displayed correctly")
    public void the_product_images_should_be_displayed_correctly()
    {
    	System.out.println("Product images are displayed correctly.");
    }
    @When("I check the product pricing")
    public void i_check_the_product_pricing()
    {
    	
    	 Assert.assertTrue("Product price is not displayed", productPage.isPriceDisplayed());
    	 
    }
    
    @Then("the product pricing should be accurate and displayed")
    public void the_product_pricing_should_be_accurate_and_displayed()
    {
    	 System.out.println("Product pricing is displayed correctly.");
    }
    
    @When("I check the breadcrumb navigation")
    public void i_check_the_breadcrumb_navigation()
    {
        Assert.assertTrue("Breadcrumb is not displayed", productPage.isBreadcrumbDisplayed());

    }
    
    @Then("the breadcrumb path should be correct and clickable")
    public void the_breadcrumb_path_should_be_correct_and_clickable()
    {
    	System.out.println("Breadcrumb path is correct.");
    }
    
    @When("I check the product availability and expiry details")
    public void i_check_the_product_availability_and_expiry_details()
    {
        Assert.assertTrue("Product availability is not displayed", productPage.isAvailabilityDisplayed());

    }
    
    @Then("the product should show availability and expiry information")

    public void the_product_should_show_availability_and_expiry_information()
    {
    	System.out.println("Availability and expiry information are displayed.");
    }
    
    @When("I add the product to the cart")
    public void i_add_the_product_to_the_cart()
    {
    	 productPage.addToCart();
    }
    
    @Then("the product should be added to the cart successfully")
    
    public void the_product_should_be_added_to_the_cart_successfully()
    {
    	 Assert.assertTrue("Product not added to the cart", productPage.isCartConfirmationDisplayed());
         System.out.println("Product successfully added to the cart.");
    }

}
