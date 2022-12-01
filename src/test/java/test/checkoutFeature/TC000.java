package test.checkoutFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.*;

public class TC000 {
    static WebDriver driver = new ChromeDriver();

    //  Creating page object

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    ShippingPage shippingPage = new ShippingPage(driver);

    @BeforeTest
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://demo.vercel.store/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
}
