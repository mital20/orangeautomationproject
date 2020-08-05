package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Util
{
    public By _errorMessage = By.id("spanMessage");
    private By _Username = By.id("txtUsername");
    private By _password = By.id("txtPassword");
    private By _ClickOnLoginButton = By.id("btnLogin");
    private By _loginPanel = By.id("logInPanelHeading");
    String ExpectedText = "LOGIN Panel";

    public void verifyUserIsOnLoginPage()
    {
       asserttextmessage(getTextFromElement(_loginPanel),ExpectedText,"user is not on logged in ");
    }
    public void userEnterloginDetails()
    {
        typetext(_Username,"Admin ");
        typetext(_password,"admin123");
    }
    public void userClicksOnLoginButton()
    {
        clickOnElement(_ClickOnLoginButton);

    }

    public void userEnterInvalidUsername(String username,String password)
    {
        typetext(_Username,username);
        typetext(_password,password);
    }
    public void userSeesErrorMessage(String message)
    {
        getTextFromElement(_errorMessage);

    }
}
