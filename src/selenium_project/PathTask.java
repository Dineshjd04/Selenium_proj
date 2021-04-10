package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PathTask {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("dinajagan007@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("catchmeifucan");
		
		WebElement login = driver.findElement(By.xpath("//a[@role='button'][1]"));
		login.click();
		
		
		WebElement text = driver.findElement
				(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String text2 = text.getText();
		
		System.out.println(text2);
		
	
		WebElement containstext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		String text3 = containstext.getText();
		
		System.out.println(text3);
		
		Thread.sleep(5000);
		
		WebElement fname = driver.findElement(By.xpath("//input[contains(@class,'_58mg ')][1]"));
		
		fname.sendKeys("Dinesh");
		
		
		

	}

}
