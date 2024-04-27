package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.BaseTest;

public class LoginPage extends BaseClass
{
	
public LoginPage(WebDriver driver)
{
	super(driver);
}

//find element 
@FindBy(name="username")
private WebElement usernameTextField;



@FindBy(name="pwd")
private WebElement passwordTextField;



@FindBy(id="keepLoggedInCheckBox")
private WebElement keepMeLogginCheckBox;

@FindBy(id="loginButton")
private WebElement loginButton;




public WebElement getUsernameTextField()
{
	return usernameTextField;
}



public WebElement getPasswordTextField()
{
	return passwordTextField;
}



public WebElement getKeepMeLogginCheckBox()
{
	return keepMeLogginCheckBox;
}


public WebElement getLoginButton()
{
	return loginButton;
}


public void validLogin(String username,String password)
{
	usernameTextField.sendKeys(username);
	passwordTextField.sendKeys(password);
	keepMeLogginCheckBox.click();
	loginButton.click();
	
}

public void invalidLogin(String username,String password)

{
usernameTextField.sendKeys(username);
passwordTextField.sendKeys(password);
keepMeLogginCheckBox.click();
loginButton.click();
usernameTextField.clear();

}
	
}	
	
















