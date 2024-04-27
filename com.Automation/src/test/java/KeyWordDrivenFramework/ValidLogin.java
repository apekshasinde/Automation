package KeyWordDrivenFramework;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest
{
	private static CharSequence UserPassword;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
	Random ro=new Random();
	int No=ro.nextInt(10000);
	BaseTest test = new BaseTest();
	test.setUp();
	Flib lib = new Flib();
	String username = lib.getDataFromProperty(Prop_Path, "username");
	String password = lib.getDataFromProperty(Prop_Path, "password");
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	
	  
	String Username1=lib.getDataFromProperty(Prop_Path, "Username1");
	driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=1692528820'])[12]")).click();
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	driver.findElement(By.name("username")).sendKeys(Username1+No);
	
	String UserPassword=lib.getDataFromProperty(Prop_Path,"UserPassword");
	driver.findElement(By.name("passwordText")).sendKeys(UserPassword+No);
	
	
	String RetypePassword=lib.getDataFromProperty(Prop_Path,"RetypePassword");
	driver.findElement(By.name("passwordTextRetype")).sendKeys(RetypePassword+No);
	
	
	String FirstName=lib.getDataFromProperty(Prop_Path,"FirstName");
	driver.findElement(By.name("firstName")).sendKeys(FirstName+No);
	
	
	String LastName=lib.getDataFromProperty(Prop_Path,"LastName");
	driver.findElement(By.name("lastName")).sendKeys(LastName+No);
	
	String WorkdayDuration=lib.getDataFromProperty(Prop_Path,"WorkdayDuration");
	driver.findElement(By.name("workdayDurationStr")).clear();
	
	driver.findElement(By.name("workdayDurationStr")).sendKeys(WorkdayDuration);
	
	driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	Thread.sleep(2000);
	
	test.tearDown();
	
	
	
	


}
}
