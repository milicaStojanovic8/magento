import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    protected WebDriver driver;


    @BeforeAll
    public static void beforeAllSetup() {
    WebDriverManager.chromedriver().setup();

}

@BeforeEach
    public void beforeEachSetup() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://magento.softwaretestingboard.com/");
}

    @AfterEach
    public void afterEachTearDown () {
//        driver.quit();
    }

}
