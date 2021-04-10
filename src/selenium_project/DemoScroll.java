package selenium_project;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScroll {
	
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Narrow casting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);");
		
		/*WebElement amazon = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		js.executeScript("arguments[0].scrollIntoView();", amazon );
		
		Thread.sleep(5000);
		
	WebElement brands = driver.findElement(By.xpath("(//h2[@class='a-color-base headline truncate-2line'])[1]"));
	
	js.executeScript("arguments[0].scrollIntoView();", brands);*/
	
	
	
	
		
		
		
		
		
		
	}

}
