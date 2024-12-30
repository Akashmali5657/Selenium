package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(name = "username")
    WebElement text_userName;

    @FindBy(name = "password")
    WebElement txt_password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[contains(text(),'Contacts')]")
    WebElement contacts;

    @FindBy(xpath = "//a[contains(text(),'New Contact')]")
    WebElement newContacts;

    @FindBy(id = "first_name")
    WebElement first_Name;

    @FindBy(id = "surname")
    WebElement txt_surname;

    @FindBy(xpath = "company_position")
    WebElement txt_companyPosition;

    @FindBy(xpath = "//input[@type='submit' and @value='Save']")
    WebElement submitAndSave;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String userName) {
        text_userName.sendKeys(userName);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginBtn.click();
    }

    public void enterFirstName(String firstName) {
        first_Name.sendKeys(firstName);
    }

    public void enterCompanyPosition(String companyPosition) {
        txt_companyPosition.sendKeys(companyPosition);
    }

    public void enterSurname(String surname) {
        txt_surname.sendKeys(surname);
    }

    public void clickSaveAndSubmit(){
        submitAndSave.click();
    }
}
