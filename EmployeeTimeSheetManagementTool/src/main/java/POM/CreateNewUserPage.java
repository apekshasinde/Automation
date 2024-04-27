package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage extends BaseClass

{

	public CreateNewUserPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement usnTextField;
	
	@FindBy(xpath="//input[@name='passwordText']")
	private WebElement pwdtextField;
	
	
	@FindBy(xpath="//input[@name='passwordTextRetype']")
	private WebElement cfmTextfield;
	
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement frstnmTextField;
	
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lsnmTextField;
	
	@FindBy(xpath="//input[@name='workdayDurationStr']")
	private WebElement wrkdTextfield;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement  createusrTextField;

	public WebElement getCreateusrTextField() {
		return createusrTextField;
	}

	public WebElement getUsnTextField() {
		return usnTextField;
	}

	public WebElement getPwdtextField() {
		return pwdtextField;
	}

	public WebElement getCfmTextfield() {
		return cfmTextfield;
	}

	public WebElement getFrstnmTextField() {
		return frstnmTextField;
	}

	public WebElement getLsnmTextField() {
		return lsnmTextField;
	}

	public WebElement getWrkdTextfield() {
		return wrkdTextfield;
	}
	
	public void createUser(String username,String password,String firstName,String lastName)
	{
		usnTextField.sendKeys(username);
		pwdtextField.sendKeys(password);
		cfmTextfield.sendKeys(password);
		frstnmTextField.sendKeys(firstName);
		lsnmTextField.sendKeys(lastName);
		createusrTextField.click();
		
	}
	
	
	
	
	

}
