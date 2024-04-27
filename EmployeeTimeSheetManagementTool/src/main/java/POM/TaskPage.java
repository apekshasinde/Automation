package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BaseClass
{

	public TaskPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement ProjectAndCustomerButton;
	
	
	
	public WebElement getProjectAndCustomerButton() {
		return ProjectAndCustomerButton;
	}
	
	
	public void CreateProjectAndCustomer()
	{
		ProjectAndCustomerButton.click();
	}

}
