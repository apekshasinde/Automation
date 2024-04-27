package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerPage extends BaseClass
{

	public CreateNewCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@type='text']")
	private  WebElement customernmTextField;
	
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement createCustomerButton;

	public WebElement getCustomernmTextField() {
		return customernmTextField;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
	
	public void createCustomer(String customerName)
	{
		customernmTextField.sendKeys(customerName);
		customernmTextField.click();
	}
	

}
