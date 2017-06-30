package Login;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest{

    private WebDriver driver;

    @Test
    public void possitiveLoginTest() {
        new HomePage(this.driver);

    }

}
