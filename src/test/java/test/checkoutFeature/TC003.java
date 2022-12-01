package test.checkoutFeature;

import org.testng.annotations.Test;

public class TC003 extends TC000 {

    /**
     * [TC003] Sort Item by price:High to Low
     */

    @Test
    public void SortPriceHighToLow() throws InterruptedException {

        driver.manage().window().maximize();
        Thread.sleep(2000);
        homePage.clickAllButton();
        homePage.clickHighToLowButton();

        driver.quit();

    }
}
