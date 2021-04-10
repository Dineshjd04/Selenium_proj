package selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_Task_Amazon {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement acc = driver.findElement(By.xpath("(//div[@class='nav-flyout-buffer-top'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(acc).build().perform();
		
		WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		signin.click();
		
		
		
		
		
		
		
	}

}
