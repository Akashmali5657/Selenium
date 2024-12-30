package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePageSAUCEDEMO;
import pages.LoginPageSAUCEDEMO;

import java.time.Duration;
import java.util.List;

public class LoginStepDefinitions {
    static WebDriver driver;
    private LoginPageSAUCEDEMO loginPageSAUCEDEMO;
    private HomePageSAUCEDEMO homePageSAUCEDEMO;

    @Before
    public void tearUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

//    @BeforeStep
//    public void beforeStep() {
//        System.out.println("Before step code");
//    }

//    @AfterStep
//    public void afterStep() {
//        System.out.println("After step code");    }

    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enter valid username as {string} and password as {string}")
    public void userEnterValidUsernameAsAndPasswordAs(String userName, String password) {
        loginPageSAUCEDEMO = new LoginPageSAUCEDEMO(driver);
        loginPageSAUCEDEMO.enterUsername(userName);
        loginPageSAUCEDEMO.enterPassword(password);
    }

    @And("click on login page")
    public void click_on_login_page() {
//        driver.findElement(By.id("login-button")).click();
        loginPageSAUCEDEMO.clickOnLoginButton();
    }

    @Then("user should be navigated on home page")
    public void user_should_be_navigated_on_home_page() {
//        Assert.assertTrue(driver.findElement(By.className("app_logo")).isDisplayed());
        isHomePageDisplayed();
    }

    @And("close browser")
    public void close_browser() {
        driver.close();
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String userName, String password) {

        loginPageSAUCEDEMO = new LoginPageSAUCEDEMO(driver);
        loginPageSAUCEDEMO.enterUsername(userName);
        loginPageSAUCEDEMO.enterPassword(password);
    }

    public void isHomePageDisplayed() {
        homePageSAUCEDEMO = new HomePageSAUCEDEMO(driver);
        homePageSAUCEDEMO.isCardDisplayed();
    }

    @After
    public void tearDown() {
        System.out.println("After scenario result");
    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword(DataTable usercredentials) {
        List<List<String>> data = usercredentials.asLists(String.class);
        System.out.println(" data.get(0).get(0) : " + data.get(0).get(0));
        System.out.println(" data.get(0).get(1) : " + data.get(0).get(1));
        loginPageSAUCEDEMO = new LoginPageSAUCEDEMO(driver);
        loginPageSAUCEDEMO.enterUsername(data.get(0).get(0));
        loginPageSAUCEDEMO.enterPassword(data.get(0).get(1));
    }
}
