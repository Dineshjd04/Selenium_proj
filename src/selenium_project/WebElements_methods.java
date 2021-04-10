package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_methods {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		// is enabled
		
	boolean enabled = email.isEnabled();
	System.out.println(enabled);
	
	// is displayed
	
	boolean displayed = email.isDisplayed();
	System.out.println(displayed);
	
	// send keys
	
	email.sendKeys("dineshjd0494@gmail.com");
	
	// get attribute
	
	String attribute = email.getAttribute("value");
	System.out.println("Passed value : "+ attribute);
	
	// get attribute-->get the value by passing attribute name
	
	String attribute2 = email.getAttribute("id");
	System.out.println("Attribute value : "+ attribute2 );
	
	// clear
	
	email.clear();
	
	// send keys
	
	email.sendKeys("dineshmirchi94@gmail.com");
	
	// get text
	
	//WebElement create_Txt = driver.findElement(By.xpath("//a[text()='create a page']"));
	//String text = create_Txt.getText();
	//System.out.println("Text : "+ text);
	
	//click
	
	WebElement create_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	create_Btn.click();
	
	Thread.sleep(2000);
	
	WebElement radio_btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	
	// is selected
	
	boolean selected = radio_btn.isSelected();
	System.out.println(selected);
	radio_btn.click();
	
	
	
	
	
	}

}
