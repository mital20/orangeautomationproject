package org.example;

import org.openqa.selenium.By;

public class LoginSuccessPage extends Util
{
    // created page for successful message
    private By _loginsuccessfulmessage = By.id("welcome");
    String expectedLoginSuccessFulMessage = "Welcome Admin";

    public void verifyUserHasLoggedIn()
    {

        assertURL("dashboard");// checking if the user on the right url

    }
    public void userCanSeeWelcomeOnPage()
    {
        //verify if the user is on right page

        asserttextmessage(getTextFromElement(_loginsuccessfulmessage),expectedLoginSuccessFulMessage,"user can not see message");
         Util.takeScreenShot("xyz");
    }
}
