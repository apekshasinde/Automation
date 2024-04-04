package Webdrivermethod;
//import org.openqa.selenium.keys;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class WorkingWithSwitchMethod 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	//Object key;
	driver.switchTo().activeElement().sendKeys("pizza",Keys.ENTER);


}
}
