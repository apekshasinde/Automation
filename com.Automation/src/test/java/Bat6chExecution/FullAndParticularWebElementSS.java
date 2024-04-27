package Bat6chExecution;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class FullAndParticularWebElementSS
{
	@Test
	
public void webElement() throws IOException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("confirmBtn")).click();
	WebElement coin=driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
	Actions act=new Actions(driver);

	act.moveToElement(coin).perform();
	driver.findElement(By.xpath("(//span[text()='2 gram'])[1]")).click();
WebElement Title=driver.findElement(By.xpath("//h1[text()=' 2 Gram 24 KT Gold Coins ']"));
File src=Title.getScreenshotAs(OutputType.FILE);
File dest=new File("./screenshot/Title.png");
Files.copy(src, dest);
TakesScreenshot ts=(TakesScreenshot)driver;
File src1=ts.getScreenshotAs(OutputType.FILE);
File dest1=new File("./screenshot/FullPage.png");
Files.copy(src1, dest1);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,2000);");
js.executeScript("document.getElementById('newsletter_subscriber').value='apekshashinde@gmail.com';");
driver.findElement(By.xpath("//input[@value='SUBSCRIBE']")).click();
}
}
