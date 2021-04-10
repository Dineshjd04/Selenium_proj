package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchFirefox {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.primevideo.com/");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.close();
		
		Thread.sleep(1000);
		
		//driver.quit();
		
	}

}
