package stepsdefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
    LoginPage loginPage;
    
    @Given("The user is on the login page")
    
    public void the_user_is_on_the_login_page()
    {
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.netmeds.com/customer/account/login");
        
        loginPage = new LoginPage(driver);
    }
    @When("The user enters a valid email and password")
    
    public void the_user_enters_a_valid_email_and_password()
    {
    	
    	 loginPage.enterMobileNumber("valid_email@example.com");
         loginPage.enterPassword("valid_password");
    }
    
    @When("The user enters an invalid email and password")
    
    public void the_user_enters_an_invalid_email_and_password()
    {
    	
    	loginPage.enterMobileNumber("invalid_email@example.com");
        loginPage.enterPassword("invalid_password");
    }
    
    @And("Clicks on the login button")
    
    public void clicks_on_the_login_button()
    {
    	loginPage.clickLoginButton();
    }
    
    @Then("The user should be logged in successfully")
    
    public void the_user_should_be_logged_in_successfully()
    {
    	
    	String expectedUrl = "https://www.netmeds.com/home";
        String actualUrl = driver.getCurrentUrl();
        assert(actualUrl.equals(expectedUrl));
        driver.quit();
    }
    
    @Then("An error message should be displayed")
    
    public void an_error_message_should_be_displayed()
    {
    	
    	 boolean isErrorDisplayed = loginPage.isErrorMessageDisplayed();
         assert(isErrorDisplayed);
         driver.quit();
    }

}
