package SerachContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys(" women pants",Keys.ENTER);
		List<WebElement> womenPant=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		for(WebElement name:womenPant)
		{
			System.out.println(name.getText());
			System.out.println("----------------");
		}
	

}

}