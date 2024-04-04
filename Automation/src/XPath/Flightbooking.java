package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightbooking 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://paytm.com/");
	Thread.sleep(2000);
driver.findElement(By.xpath("//img[@ src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
    Thread.sleep(2000);
	driver.findElement(By.id("From"));
	driver.findElement(By.id("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
	driver.findElement(By.xpath("(//button[text()='Search Flights'])[1]")).click();
	//driver.findElement(By.xpath("//span[@id='departureDate']")).click();
	//driver.findElement(By.className("//img[@class='_3i2Wp']")).click();
	// driver.findElement(By.xpath("//span[@id='srcCode']")).click();
	//driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
    //driver.findElement(By.className("class=\"_1X2Sn\"")).sendKeys("PNQ");
    //driver.findElement(By.xpath("//span[@class='_38H9z']")).click();
    
    //driver.findElement(By.xpath("//input[@class='_1X2Sn _1DJkH']")).click();
    //driver.findElement(By.xpath("//input[@id='text-box']")).click();
    //driver.findElement(By.xpath("//button[@class='rippleButton']")).click();
    //driver.findElement(By.xpath("//img[@src='/travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg']")).click();
    //driver.findElement(By.xpath("//img[@src='//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg']")).click();
    //driver.findElement(By.xpath("//img[@src='//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg']")).click();
}
}
