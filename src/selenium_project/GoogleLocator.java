package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLocator {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("Greens technology");
			
		//WebElement search = driver.findElement(By.name("hsuHs"));
		//search.click();
		
	}

}
