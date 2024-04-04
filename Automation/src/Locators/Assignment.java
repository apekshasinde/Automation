package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{

public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
	WebElement EmailTextField=driver.findElement(By.id("email"));
	EmailTextField.sendKeys("apekshashinde2003@gmail.com");
	
	WebElement PasswordTextField=driver.findElement(By.id("pass"));
	PasswordTextField.sendKeys("shivisha");
	
	WebElement Loginbutton=driver.findElement(By.name("login"));
	Loginbutton.click();
}
		}