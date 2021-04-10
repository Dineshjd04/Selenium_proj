package selenium_project;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_concept {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		email.sendKeys("dineshjd0494@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("Dineshjd@04");
		
		WebElement login_Btn = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		login_Btn.click();
		
		Thread.sleep(2000);
		
		// narrowing type casting
		
		TakesScreenshot ts =  (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("");
		
		
		
		
		
		
		
		
		
		
		
		
		
}



}
