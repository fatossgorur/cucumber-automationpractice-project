package definitions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class RegisterStep {

    private WebDriver driver;
    RegisterPage registerPage = new RegisterPage();

    @Given("^navigate to website$")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^click sign in button$")
    public void clickSignInButton() {
        registerPage.clickSignInButton();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {
        registerPage.typeEmail(email);
    }

    @And("^click create an account button$")
    public void clickCreateAnAccountButton() {
        registerPage.clickCreateButton();
    }

    @And("^choose title$")
    public void chooseTitle() {
        registerPage.clickGender();
    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable {
        registerPage.typeFirstnameAndLastname(firstname,lastname);
    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable {
        registerPage.typePassword(password);
    }

    @And("^type company \"([^\"]*)\"$")
    public void typeCompany(String company) throws Throwable {
        registerPage.typeCompany(company);
    }

    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address) throws Throwable {
        registerPage.typeAddress(address);
    }

    @After
    public void quitDriver() throws InterruptedException{
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
