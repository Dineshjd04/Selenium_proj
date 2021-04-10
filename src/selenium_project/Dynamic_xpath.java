package selenium_project;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		List<WebElement> all_Prizes = driver.findElements(By.xpath("//span[@class='product-strike']//preceding.sibling::span"));
		
		List<Integer> price_list = new ArrayList<Integer>();
		
		for (WebElement prizes : all_Prizes) {
			
			String prize = prizes.getText().replace("Rs. ", "");
			
			int value = Integer.parseInt(prize);
			
			price_list.add(value);
			
		}
		
		System.out.println(price_list);
		
		
		
		
			
			
			
			
		
			
		
	}

}
