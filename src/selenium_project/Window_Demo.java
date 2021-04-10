package selenium_project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Demo {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		
		Robot r = new Robot();
		
		WebElement computers = driver.findElement(By.xpath("(//a[@class='nav-a  '])[11]"));
		ac.contextClick(computers).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement todays_Deal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(todays_Deal).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement newRe = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		ac.contextClick(newRe).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> allId = driver.getWindowHandles();
		
		for  (String id : allId) {
			
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
			
		}
		
		String actualtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(actualtitle)) {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
