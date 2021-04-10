package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		
		Thread.sleep(5000);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		
		WebElement cDress = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		act.click(cDress).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
