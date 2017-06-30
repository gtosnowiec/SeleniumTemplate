package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

    public String getPageSource() {
        return this.driver.getPageSource();
    }

    public LoginPage navigateToLoginPage(){
        return new LoginPage(driver);
    }
}
