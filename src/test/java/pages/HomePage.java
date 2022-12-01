package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //  Locator and method for Quarter Zip item
    By QuarterZip = By.xpath("/html//div[@id='__next']//main/div[1]/a[@href='/product/quarter-zip']");
    public void clickQuarterZip () { driver.findElement(QuarterZip).click(); }

    // Locator and method for Add to Cart button
    By AddToCart = By.cssSelector("[aria-label='Add to Cart']");
    public void clickAddToCart() { driver.findElement(AddToCart).click(); }

    // Locator and method for profile button
    By ProfileButton = By.cssSelector(".UserNav_avatarButton__9exMf");
    public void clickProfileButton() { driver.findElement(ProfileButton).click(); }

    // Locator and method for add quantity
    By AddQuantityButton = By.cssSelector("[class] .Quantity_actions__C9fVt:nth-child(4)");
    public void clickAddQuantityButton() { driver.findElement(AddQuantityButton).click();}

    // Locator and method for close button
    By CloseButton = By.cssSelector("[aria-label] [d='M6 6l12 12']");
    public void clickCloseButton() { driver.findElement(CloseButton).click();}

    // Locator and method for search field
    By SearchField = By.id("search");
    public void inputSearchField(String search) { driver.findElement(SearchField).sendKeys(search);}

    // Locator and method for Bomber jacket
    By BomberJacket = By.cssSelector(".ProductCard_productImage__nbfNy");
    public void clickBomberJacket() { driver.findElement(BomberJacket).click();}

    // Locator and method for Proceed to Checkout button
    By ProceedToCheckoutButton = By.linkText("PROCEED TO CHECKOUT");
    public void clickProceedToCheckoutButton() { driver.findElement(ProceedToCheckoutButton).click();}

    // Locator and method for Proceed to Checkout button
    By AllButton = By.linkText("All");
    public void clickAllButton() { driver.findElement(AllButton).click();}

    // Locator and method for sort High to Low button
    By HighToLowButton = By.linkText("Price: High to low");
    public void clickHighToLowButton() { driver.findElement(HighToLowButton).click();}
}
