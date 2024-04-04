package Locators;

//import javax.swing.text.Element;

//import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.w3c.dom.Element;
//import org.w3c.dom.Element;

public class TagName 
{
private static WebElement WebElement;
private static org.openqa.selenium.WebElement element;

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tricentis.com//");
	
	WebElement =driver.findElement(By.tagName("input"));
	element.sendKeys("Books");
}

}
