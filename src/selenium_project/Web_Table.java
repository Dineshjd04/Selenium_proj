package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> all_Data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		System.out.println("****ALL DATA****");
		
		for (WebElement datas : all_Data) {
			
			String text = datas.getText();
			
			System.out.println(text);
			
		}
		
		System.out.println("****ROW DATA****");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		
		for (WebElement datas : rowdata) {
			
			String text = datas.getText();
			
			System.out.println(text);
				
		}
		
		System.out.println("****COLUMN DATA****");
		
		List<WebElement> column_Datas = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		for (WebElement column : column_Datas) {
			
			String text = column.getText();
			
			System.out.println(text);
				
		}
		
		System.out.println("****PARTICULAR DATA****");
		
		WebElement particulad_Data = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
		
		String text = particulad_Data.getText();
		
		System.out.println(text);
		
		System.out.println("****HEADERS****");
		
		List<WebElement> headers = driver.findElements(By.tagName("th"));
		
		for (int i = 0; i < headers.size(); i++) {
			
			String text2 = headers.get(i).getText();
			
			System.out.println(text2);
			
		}
		
		}
		
	}


