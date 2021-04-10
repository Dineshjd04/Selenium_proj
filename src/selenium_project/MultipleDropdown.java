package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
				
				driver.manage().window().maximize();
				
				
				WebElement multi_Drop = driver.findElement(By.id("multi-select"));
				
				Select s = new Select(multi_Drop);
				
				// is multiple
				
				boolean multiple = s.isMultiple();
				
				System.out.println(multiple);
				
				// get the options in the multiple_Dropdown
				
				System.out.println("****LIST OF OPTIONS****");
				List<WebElement> options = s.getOptions();
				for (WebElement goptions : options) {
					String text = goptions.getText();
					System.out.println(text);
					
				}
				
				// to get the size
				
				System.out.println("****SIZE****");
				int size = options.size();
				System.out.println(size);
				
				// for loop
				
				for (int i = 0; i < options.size(); i++) {
					if (i == 1 || i == 2 || i == 5) {
						s.selectByIndex(i);
						System.out.println(i);	
					}
				}
				
				// get all selected options
				
				List<WebElement> allSelected = s.getAllSelectedOptions();
				for (WebElement selected : allSelected) {
					System.out.println(selected.getText());
					
				}
				
				// get first selected
				System.out.println("****FIRST SELECTED****");
				WebElement firstSelected = s.getFirstSelectedOption();
				String text = firstSelected.getText();
					System.out.println(text);
				
							
	}

}
