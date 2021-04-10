package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchTask {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.bcci.tv/");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.close();
		
		Thread.sleep(100000);
		
		driver.quit();
		
	}

}
