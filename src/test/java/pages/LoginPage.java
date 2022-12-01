package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //  Locator and method for Sign Up button
    By SignUpButton = By.xpath("/html//div[@id='__next']//div[@role='dialog']//form//a[.='Sign Up']");
    public void clickSignUpButton () { driver.findElement(SignUpButton).click(); }

    // Locator and method for input field First Name
    By fieldFirstName = By.cssSelector("[class] label:nth-of-type(1) [autocomplete]");
    public void inputfieldFirstName (String FirstName) { driver.findElement(fieldFirstName).sendKeys(FirstName); }

    // Locator and method for input field Last Name
    By fieldLastName = By.cssSelector("[class] label:nth-of-type(2) [autocomplete]");
    public void inputfieldLastName (String LastName) { driver.findElement(fieldLastName).sendKeys(LastName);}

    // Locator and method for input field email
    By fieldEmail = By.cssSelector("[class] label:nth-of-type(3) [autocomplete]");
    public void inputfieldEmail (String Email) { driver.findElement(fieldEmail).sendKeys(Email);}

    // Locator and method for input field Password
    By fieldPassword = By.cssSelector("[class] label:nth-of-type(4) [autocomplete]");
    public void inputfieldPassword (String Password) { driver.findElement(fieldPassword).sendKeys(Password);}

    // Locator and method for button Sign Up
    By SignUpButton2 = By.cssSelector("[type='submit']");
    public void clickSignUpButton2 () { driver.findElement(SignUpButton2).click(); }

    // Locator and method for Forgot PIN
    By WebappForgotPin = By.linkText("Forgot PIN?");
    public void clickForgotPin () { driver.findElement(WebappForgotPin).click(); }

    // Locator and method for Enter button Forgot PIN
    By WebappEnterBtn = By.xpath("//button[contains(text(),'Enter')]");
    public void clickWebappEnterBtn () { driver.findElement(WebappEnterBtn).click(); }

    // Locator and method for Phone field forgot PIN
    By WebappPhoneForgot = By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public void inputWebappPhoneForgot (String number) { driver.findElement(WebappPhoneForgot).sendKeys(number); }

}
