package stepsdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.Medicine;

public class NetmedsSteps {
	
	WebDriver driver;
    LoginPage loginPage;
    Medicine medicinesPage;
    
    @Given("I am logged in to the Netmeds website")
    
    public void i_am_logged_in_to_the_netmeds_website()
    {
    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.netmeds.com/");
         
         loginPage = new LoginPage(driver);
         loginPage.clickLoginButton();
         loginPage.enterEmail("test@example.com");
         loginPage.enterPassword("password123");
         loginPage.clickSubmit();
    }
    
    @When("I click on {string} and navigate to {string}")
    
    public void i_click_on_and_navigate_to(String menu, String submenu)
    {
    	medicinesPage = new Medicine(driver);
        medicinesPage.clickMedicinesMenu();
        medicinesPage.clickAllMedicines();
    }
    
    @When("I search for {string}")
    public void i_search_for(String searchTerm)
    {
    	 medicinesPage.searchForMedicine(searchTerm);
    }
    
    @When("I select {string}")
    public void i_select(String medicineName)
    {
    	 medicinesPage.selectPacimol();
    }
    
    @Then("I should be navigated to the Pacimol product page")
    public void i_should_be_navigated_to_the_pacimol_product_page()
    {
    	
    	String expectedTitle = "Pacimol 120mg Suspension 60ml";
    	 String actualTitle = driver.getTitle();
    	 assert(actualTitle.contains(expectedTitle)) : "Product page title mismatch";
    	 driver.quit();
    }
    
    

}
