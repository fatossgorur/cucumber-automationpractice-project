package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactUsPage;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class ContactUsStep {

    private WebDriver driver;
    ContactUsPage contactUsPage = new ContactUsPage();


    @Given("^go to website$")
    public void go_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^click contact us button$")
    public void click_contact_us_button() {
        contactUsPage.clickContactUsButton();
    }

    @Given("^select subject heading$")
    public void select_subject_heading() {
        contactUsPage.selectSubjectHeading();
    }

    @Given("^type email$")
    public void type_email() {
        contactUsPage.typeEmail();
    }

    @Given("^type order reference$")
    public void type_order_reference() {
        contactUsPage.typeOrderReference();
    }

    @Given("^type message$")
    public void type_message() {
        contactUsPage.typeMessage();
    }

    @When("^click send button$")
    public void click_send_button() {
        contactUsPage.clickSendButton();
    }

    @Then("^verify success$")
    public void verify_success() {
        contactUsPage.verifySuccessMessage();
    }
}
