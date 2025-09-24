package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.PendingException;

public class LoginSteps {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on the login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User entered valid credentials");
    }
    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is redirected to the dashboard");
    }

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User entered invalid credentials");
    }
    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Error message is displayed");
    }
}