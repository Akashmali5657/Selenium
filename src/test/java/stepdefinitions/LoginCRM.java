package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LoginPage;

import java.time.Duration;

public class LoginCRM {

    static WebDriver driver;
    private final LoginPage loginPage = new LoginPage(driver);

    @Before
    public void tearUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @Given("^open Login Page$")
    public void open_login_page() {
        driver.get("https://ui.cogmento.com/");
    }

    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_CRM() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM", title);
    }

    //Reg Exp:
    //1. \"([^\"]*)\"
    //2. \"(.*)\"

    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        WebElement loginBtn =
                driver.findElement(By.xpath("//input[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);
    }

    @Then("^user is on home page$")
    public void user_is_on_hopme_page() {
        String title = driver.getTitle();
        System.out.println("Home Page title ::" + title);
        Assert.assertEquals("CRMPRO", title);
    }

    @Then("^user moves to new contact page$")
    public void user_moves_to_new_contact_page() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();

    }

    @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enters_contacts_details(String firstname, String lastname, String position) {
        loginPage.enterFirstName(firstname);
        loginPage.enterSurname(lastname);
        loginPage.enterCompanyPosition(position);
        loginPage.clickSaveAndSubmit();

//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
    }

    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.quit();
    }
}