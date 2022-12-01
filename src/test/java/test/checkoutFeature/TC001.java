package test.checkoutFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001 extends TC000{

    /**
     * Checkout One Product
     */

    @Test
    public void CheckoutOnePruduct() throws InterruptedException {

        driver.manage().window().maximize();
        Thread.sleep(1000);
        homePage.clickQuarterZip();
        Thread.sleep(1000);
        homePage.clickAddToCart();
        Thread.sleep(1000);

        String checkoutTitle = "Quarter Zip - ACME Storefront";
        Assert.assertEquals(checkoutTitle, driver.getTitle());

        driver.quit();
    }
}