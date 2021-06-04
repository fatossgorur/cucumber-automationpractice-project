package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class Methods {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    public void clickElement(WebElement element) {
        //elementimiz click olabilecek hale gelene kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeysElement(WebElement element, String value) {
        //elementimiz gözükene kadar bekle
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public void selectElementFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}
