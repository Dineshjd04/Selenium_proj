package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path_task_Insta {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		WebElement mobno = driver.findElement(By.xpath("//input[@name='_2hvTZ pexuQ zyHYP']"));
		mobno.sendKeys("9043514492");
		
}

}
