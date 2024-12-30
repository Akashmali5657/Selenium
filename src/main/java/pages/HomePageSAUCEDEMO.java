package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSAUCEDEMO {
    WebDriver driver;
    @FindBy(className = "shopping_cart_link")
    WebElement lbl_card;

    public HomePageSAUCEDEMO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isCardDisplayed() {
        lbl_card.isDisplayed();
    }
}
