package SerachContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Locators.name;

public class WorkingWithFindElementsMethods
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("ipad", Keys.ENTER);
	List<WebElement>ipadName=driver.findElements(By.xpath("//div[@class='_4rR01T\']"));
	List <WebElement>ipadPrice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	//List<WebElement> Price=ipadPrice;
	for(WebElement name:ipadName);
	{
		System.out.println(name.getText());
		
	}
//	for(int i=0;i<ipadName.size();i++)
//		
//	{
//       System.out.println(ipadName.get(i).getText());
//	}
//}
}
}
