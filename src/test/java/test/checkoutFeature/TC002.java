package test.checkoutFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002 extends TC000 {

    /**
     * [TC002] CReate new account and do checkout
     */

    @Test
    public void CreateNewAccountAndCheckout() throws InterruptedException {

        driver.manage().window().maximize();
        Thread.sleep(2000);
        homePage.clickProfileButton();
        Thread.sleep(1000);
        loginPage.clickSignUpButton();
        Thread.sleep(1000);
        loginPage.inputfieldFirstName("Farid");
        loginPage.inputfieldLastName("Isfiyanto");
        loginPage.inputfieldEmail("Far@yahoo.com");
        loginPage.inputfieldPassword("Flip2022");
        loginPage.clickSignUpButton2();
        Thread.sleep(5000);
        homePage.clickQuarterZip();
        Thread.sleep(1000);
        homePage.clickAddToCart();
        Thread.sleep(2000);
        homePage.clickAddQuantityButton();
        homePage.clickCloseButton();
        homePage.inputSearchField("bomber");

        WebElement search = driver.findElement(By.id("search"));
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        homePage.clickBomberJacket();
        homePage.clickAddToCart();
        Thread.sleep(1000);
        homePage.clickProceedToCheckoutButton();
        Thread.sleep(5000);

        // Redirect to shipping page
        String checkoutTitle1 = "Information - Next.js Store - Checkout";
        Assert.assertEquals(checkoutTitle1, driver.getTitle());

        shippingPage.inputPhoneField("88888888");
        shippingPage.inputfieldFirstName("Farid");
        shippingPage.inputfieldLastName("Isfiyanto");
        shippingPage.inputfieldAddress("Sleman");
        shippingPage.inputfieldCity("Yogyakarta");
        shippingPage.inputfieldPostalcode("57533");
        shippingPage.clickCotinueToShippingButton();

        // Redirect to shipping method screen
        String checkoutTitle2 = "Information - Next.js Store - Checkout";
        Assert.assertEquals(checkoutTitle2, driver.getTitle());

        driver.quit();
    }
}
