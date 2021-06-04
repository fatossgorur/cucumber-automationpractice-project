package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {

    WebDriver driver;
    Methods methods;

    public ContactUsPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
        methods = new Methods();
    }

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
        methods.clickElement(contactUsButton);
    }

    @FindBy(id = "id_contact")
    private WebElement subjectHeadingDropDown;

    public void selectSubjectHeading(){
        methods.selectElementFromDropDown(subjectHeadingDropDown,"Webmaster");
    }

    @FindBy(id = "email")
    private WebElement emailText;

    public void typeEmail(){
        methods.sendKeysElement(emailText,"cucumber.deneme@gmail.com");
    }

    @FindBy(id = "id_order")
    private WebElement orderReferenceText;

    public void typeOrderReference(){
        methods.sendKeysElement(orderReferenceText,"order1234");
    }

    @FindBy(id = "message")
    private WebElement messageText;

    public void typeMessage(){
        methods.sendKeysElement(messageText,"Urun defoludur.");
    }

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public void clickSendButton(){
        methods.clickElement(sendButton);
    }

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void verifySuccessMessage(){
        Assert.assertEquals(successMessage.getText(),"Your message has been successfully sent to our team.");
    }
}
