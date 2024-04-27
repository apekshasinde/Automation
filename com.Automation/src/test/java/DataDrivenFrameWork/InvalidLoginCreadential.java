package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginCreadential 

{
	public static void main(String[] args) throws  InterruptedException, IOException {
		Flip lib = new Flip();
		String url = lib.getDataFromPropertyFile("./src/test/resources/abc.properties", "url");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		int rowCount = lib.getRowCount("./src/test/resources/sheet1.xlsx", "Sheet1");
		
		for(int i=0;i<rowCount;i++)
		{
			String username = lib.getDataFromExcelFile("./src/test/resources/sheet1.xlsx", "Sheet1", i+1, 0);
			String password = lib.getDataFromExcelFile("./src/test/resources/sheet1.xlsx", "Sheet1", i+1, 1);
			// pass the username
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("pwd")).clear();
			Thread.sleep(2000);
		}
		}
}

