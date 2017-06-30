package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {

    WebDriver driver;
    final String base_url = "http://automationpractice.com/index.php";
    private String chrome_windows_path = "src\\main\\resources\\driver\\chromedriver_windows\\chromedriver.exe";

    @BeforeTest(alwaysRun = true)
    protected void setUp() {
        System.setProperty("webdriver.chrome.driver", chrome_windows_path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        this.driver = new ChromeDriver(options);
    }

    @Parameters
    @BeforeMethod(alwaysRun = true)
    protected void prepareBrowser(@Optional(base_url) String environment) {
        this.driver.get(environment);
    }

    @AfterMethod(alwaysRun = true)
    protected void cleanUp() {
        this.driver.manage().deleteAllCookies();
    }

    @AfterTest(alwaysRun = true)
    protected void driverGone() {
        this.driver.close();
    }
}
