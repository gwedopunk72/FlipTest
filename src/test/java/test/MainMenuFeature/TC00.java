package test.MainMenuFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginPage;

public class TC00 {
    static WebDriver driver = new ChromeDriver();

    //  Creating page object

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @BeforeTest
    public void initialize() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

}


