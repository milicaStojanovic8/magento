import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomePageProductsTests extends BaseTests {


    @Test
    public void addProductToCartTest() {

        HomePage homePage = new HomePage(driver);
        homePage.addItemToCart(0);
    }
    @Test
    public void createACCTest() {

        HomePage homePage = new HomePage(driver);
        homePage.addItemToCart(0);
        homePage.createAnAccount();
        homePage.inputFirstNameForCreatingACC("Monica");
        homePage.inputLastNameForCreatingACC("Geler");
    }

}
