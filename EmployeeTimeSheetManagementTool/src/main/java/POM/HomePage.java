package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass

{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//a[@class=\"content users\"]")
	private WebElement userLink;
	
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement taskLink;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutLink;

	public WebElement getUserLink() {
		return userLink;
	}

	public WebElement getTaskLink() {
		return taskLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
    public void clickOnUserLink()
    {
    	userLink.click();
    }
    
    public void clickOnTaskLink()
    {
    	taskLink.click();
    }
    
    
    public void clickOnLogoutLink()
    {
   
    	logoutLink.click();
    }
    
    
    
	
}
