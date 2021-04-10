package selenium_Task;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Task {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		
		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		mobiles.click();
		
		WebElement mob_Acc = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		ac.moveToElement(mob_Acc).build().perform();
		
		WebElement head_Ph = driver.findElement(By.xpath("//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-1:0\"]/div[2]/div/div[1]/ul/li[4]/a"));
		ac.click(head_Ph).build().perform();
		
		WebElement r_Click = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(r_Click).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
