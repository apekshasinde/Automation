package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SwagLabs 
{


	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user",Keys.TAB);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce",Keys.ENTER);
		driver.findElement(By.xpath("//a[@data-test='item-4-img-link']")).click();
		driver.findElement(By.xpath("//button[@data-test='add-to-cart']")).click();
		driver.findElement(By.xpath("//span[@data-test='shopping-cart-badge']")).click();
WebElement ProductName=driver.findElement(By.xpath("//div[@data-test='inventory-item-name']"));
WebElement ProductPrice=driver.findElement(By.xpath("//div[@data-test='inventory-item-price']"));
System.out.println(ProductName.getText());
System.out.println(ProductPrice.getText());
WebElement expectedprice=driver.findElement(By.xpath("//div[@data-test='inventory-item-price']"));
if(ProductPrice.equals(expectedprice))
{
System.out.println("price is same");
}
else
{
	System.out.println("price is different");
}
driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("apeksha",Keys.TAB,"shinde",Keys.TAB,"410401",Keys.TAB);
driver.findElement(By.xpath("//input[@data-test='continue']")).click();
driver.findElement(By.xpath("//button[@data-test='finish']")).click();
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("./screenshot/Successfullreponse.png");
Files.copy(src, dest);





}
}