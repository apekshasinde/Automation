package SerachContext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBlinkit
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://blinkit.com/");
	 WebElement Location=driver.findElement(By.xpath("//input[@placeholder='search delivery location']"));
	 Location.sendKeys("Qspiders Pune Wakad");
    Thread.sleep(2000);
	 Location.clear();
	// Thread.sleep(2000);
	 Location.sendKeys("Qspiders Pune Wakad");
	// Thread.sleep(2000);
	 //driver.findElement(By.xpath("/div[contain(text(),'Qspiders Pune Wakad')]")).click();
	// Thread.sleep(2000);
	 driver.findElement(By.xpath("(//div[text()='QSpiders Pune Wakad, Dange Chowk Road, Gujar Nagar, Jai Hind nagar, Thergaon, Pune, Maharashtra, India'])[2]")).click();
	 driver.findElement(By.xpath("//div[@class='SearchBar__PlaceholderContainer-sc-16lps2d-0 dPbxWD']")).sendKeys("sugar",Keys.ENTER);
	 //driver.findElement(By.xpath("//div[@class='SearchBar__IconContainer-sc-16lps2d-5 hcexgJ']")).click();
	// driver.findElement(By.xpath("//a[@href='/s/']")).click();
	 //driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).click();
	 //driver.findElement(By.xpath("//div[@class='SearchBar__IconContainer-sc-16lps2d-5 hcexgJ']")).sendKeys("sugar",Keys.ENTER);
	//driver.findElement(By.xpath("//div[@class='SearchBar__IconContainer-sc-16lps2d-5 hcexgJ']"));
	//driver.findElement(By.xpath("//header[contains(@class,'etwMDu')]/descendant::input[@class='SearchBarCpntainer_Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar",Keys.ENTER);
			
}
}
