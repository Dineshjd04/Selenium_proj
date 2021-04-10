package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchGoogle {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
	
		// to get the url
		driver.get("https://www.google.com/maps/");
		
		//to get the current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		// to get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//maximize a window
		driver.manage().window().maximize();
		
		//navigation methods
		//move to another window
		driver.navigate().to("https://www.poorvikamobile.com/");
		
		//back
		driver.navigate().back();
		
		//refresh
		driver.navigate().refresh();
		
		//close
		driver.close();
		
		Thread.sleep(50000);
		
		//quit
		driver.quit();
		
	}
	
}