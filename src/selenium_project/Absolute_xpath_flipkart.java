package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath_flipkart {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH JD\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=apple&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=apple%7CMobiles&requestId=8dd38f97-c665-45b6-815a-feba0ba9efd4&as-searchtext=appple");
		
		WebElement iphone = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[1]/div/div/img"));
		
		iphone.click();
		
		driver.close();
}
}
