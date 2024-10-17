package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Medicinesearch {
	
    WebDriver driver;

    public Medicinesearch(WebDriver driver) {
        this.driver = driver;
    }
    
    By medicinesMenu = By.xpath("//a[@title='Medicines']");
    By allMedicines = By.xpath("//a[contains(text(), 'All Medicines')]");
    By searchBox = By.id("search");  
    By pacimolProduct = By.xpath("//a[contains(text(),'Pacimol 120mg Suspension 60ml')]");
    
    public void clickMedicinesMenu() {
        driver.findElement(medicinesMenu).click();
    }
    
    public void clickAllMedicines() {
        driver.findElement(allMedicines).click();
    }
    
    public void searchForMedicine(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchBox).submit();
    }
    
    public void selectPacimol() {
        driver.findElement(pacimolProduct).click();
    }
    
    

}
