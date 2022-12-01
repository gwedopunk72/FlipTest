package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    //  Locator and method for email or phone field
    By phoneField = By.id("email");
    public void inputPhoneField (String phone) { driver.findElement(phoneField).sendKeys(phone); }

    // Locator and method for input field First Name
    By fieldFirstName = By.id("TextField0");
    public void inputfieldFirstName (String FirstName) { driver.findElement(fieldFirstName).sendKeys(FirstName); }

    // Locator and method for input field Last Name
    By fieldLastName = By.id("TextField1");
    public void inputfieldLastName (String LastName) { driver.findElement(fieldLastName).sendKeys(LastName);}

    // Locator and method for input field address
    By fieldAddress = By.id("TextField2");
    public void inputfieldAddress (String address) { driver.findElement(fieldAddress).sendKeys(address);}

    // Locator and method for input field City
    By fieldCity = By.id("TextField6");
    public void inputfieldCity (String city) { driver.findElement(fieldCity).sendKeys(city);}

    // Locator and method for input field postalcode
    By fieldPostalcode = By.id("TextField7");
    public void inputfieldPostalcode (String postalcode) { driver.findElement(fieldPostalcode).sendKeys(postalcode);}

    // Locator and method for button Continue to shipping
    By ContinueToShippingButton = By.cssSelector("._10zXD");
    public void clickCotinueToShippingButton() { driver.findElement(ContinueToShippingButton).click();}


}
