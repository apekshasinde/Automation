package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyAutomate
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://open.spotify.com/search");
	driver.findElement(By.xpath("//button[@data-testid='login-button']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("login-username")).sendKeys("apekshashinde2003@gmail.com",Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.id("login-password")).sendKeys("apekshashinde20",Keys.ENTER);

WebElement s=driver.findElement(By.xpath("//input[@data-testid='search-input']"));
Thread.sleep(1000);
	s.sendKeys("arjit songs",Keys.ENTER);
	
driver.findElement(By.xpath("//div[text()='Agar Tum Saath Ho (From \"Tamasha\")']")).click();
Thread.sleep(2000);
driver.findElement(By.id("onetrust-close-btn-container")).click();
driver.findElement(By.className("vnCew8qzJq3cVGlYFXRI")).click();
	
}
}