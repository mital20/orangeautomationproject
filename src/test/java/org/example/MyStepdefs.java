package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs
{
    LoginPage loginPage = new LoginPage();
    LoginSuccessPage loginSuccessPage = new LoginSuccessPage();


    @Given("^User is on Login page$")
    public void user_is_on_Login_page()  {
        loginPage.verifyUserIsOnLoginPage();

    }
    @When("^User enters valid username and valid password$")
    public void user_enters_valid_username_and_valid_password()  {
        loginPage.userEnterloginDetails();

    }

    @And("^User click on login button$")
    public void user_click_on_login_button()  {
        loginPage.userClicksOnLoginButton();

    }

    @Then("^user has login successfully$")
    public void userHasLoginSuccessfully() {
        loginSuccessPage.verifyUserHasLoggedIn();
        loginSuccessPage.userCanSeeWelcomeOnPage();
    }

    @When("^User enters invalid \"([^\"]*)\" and  invalid \"([^\"]*)\"$")
    public void userEntersInvalidAndInvalid(String username, String password)
    {
        loginPage.userEnterInvalidUsername(username,password);

    }

    @Then("^user sees error \"([^\"]*)\"$")
    public void userSeesError(String message)
    {
        loginPage.userSeesErrorMessage(message);

    }
}
