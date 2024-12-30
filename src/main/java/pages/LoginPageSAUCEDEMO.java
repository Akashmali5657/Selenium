package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSAUCEDEMO {
    WebDriver driver;
    @FindBy(id="user-name")
    WebElement text_userName;

    @FindBy(id="password")
    WebElement text_password;

    @FindBy(id="login-button")
    WebElement btn_Login;

    public LoginPageSAUCEDEMO(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String userName){
        text_userName.sendKeys(userName);
    }

    public void enterPassword(String password){
        text_password.sendKeys(password);
    }

    public void clickOnLoginButton(){
        btn_Login.click();
    }
}
