package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage extends Methods{

    WebDriver driver;
    Methods methods;

    public RegisterPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
        methods = new Methods();
    }

    @FindBy(css = "a[class='login']")
    private WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement emailAddressText;

    @FindBy(id = "SubmitCreate")
    private WebElement createButton;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameText;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameText;

    @FindBy(id = "passwd")
    private WebElement passwordText;

    @FindBy(id = "company")
    private WebElement companyText;

    @FindBy(id = "address1")
    private WebElement addressText;

    public void clickSignInButton(){
        clickElement(signInButton);
    }

    public void typeEmail(String email){
        sendKeysElement(emailAddressText,email);
    }

    public void clickCreateButton(){
        clickElement(createButton);
    }

    public void clickGender(){
        clickElement(gender);
    }

    public void typeFirstnameAndLastname(String firstname, String lastname){
        sendKeysElement(firstNameText,firstname);
        sendKeysElement(lastNameText,lastname);
    }

    public void typePassword(String password){
        sendKeysElement(passwordText,password);
    }

    public void typeCompany(String company){
        sendKeysElement(companyText,company);
    }

    public void typeAddress(String address){
        sendKeysElement(addressText,address);
    }

}
