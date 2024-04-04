package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement stf=driver.findElement(By.name("q"));
		stf.sendKeys("laptop",Keys.ENTER);
		 
		WebElement Serachbutton=driver.findElement(By.className("ziLD"));
	}


}