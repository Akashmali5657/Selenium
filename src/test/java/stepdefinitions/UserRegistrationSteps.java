package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

    @Given("the following users exist:")
    public void the_following_users_exist(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("I open the registration page")
    public void i_open_the_registration_page() {
    }

    @When("I fill in the registration form with:")
    public void i_fill_in_the_registration_form_with(io.cucumber.datatable.DataTable dataTable) {
    }

    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
       }

}
