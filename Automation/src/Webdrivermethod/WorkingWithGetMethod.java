package Webdrivermethod;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethod
{
	public static void main(String[] args) {
		
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com");
	String actual_title=driver.getTitle();
	String expected_title="Amazon.com. Spend less. Smile more.";
	if(actual_title.equals(expected_title)){
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
	

}
}