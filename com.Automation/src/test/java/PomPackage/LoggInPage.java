package PomPackage;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggInPage 
{
	
		
		public LoggInPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
		
	
		
	
	@FindBy(name="username")
	private WebElement UserNameTextField;
	
	
	@FindBy(name="password")
	private WebElement PasswordTextField;
	
	@FindBy(name="remember")
	private  WebElement KeepMeInLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement LoggInButton;
	
	
	

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	
	
	
	public WebElement getPasswordTextField()
	{
		return PasswordTextField;
	}
	
	public WebElement getKeepMeInLoggedInCheckBox() 
	{
		return KeepMeInLoggedInCheckBox;
	}
	
	public WebElement getLoggInButton()
	{
		return LoggInButton;
	}

	
	public void validLogin(String username, String password)
	{
		UserNameTextField.sendKeys("admin");
		PasswordTextField.sendKeys("manager");
		KeepMeInLoggedInCheckBox.click();
		LoggInButton.click();
	}
	
	
	
	
	

	
	
	
	
	
	
	

}
