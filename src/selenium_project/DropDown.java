package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		button.click();
		
		Thread.sleep(5000);
		
		WebElement dob = driver.findElement(By.id("day"));
		Select s = new Select(dob);
		s.selectByValue("4");
		
		Thread.sleep(5000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		
		Thread.sleep(5000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByIndex(10);
		
		
	}

}
