package Webdrivermethod;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class GetSourcePage {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		String Source=driver.getPageSource();
		System.out.println(Source);
			
		
	}

}
