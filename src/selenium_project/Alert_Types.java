package selenium_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alert_Btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alert_Btn.click();
		
		Alert simple_alert = driver.switchTo().alert();
		simple_alert.accept();
		
		Thread.sleep(2000);
		
		WebElement ok_CancelBtn = driver.findElement(By.xpath("//a[@class='analystic']"));
		ok_CancelBtn.click();
		
		
		/*WebElement confirn_Btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirn_Btn.click();
		
		
		Alert confirm_Alert = driver.switchTo().alert();
		confirm_Alert.accept();
		
		Thread.sleep(5000);*/
		
		WebElement textbox_btn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textbox_btn.click();
		
		WebElement prompt_Btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompt_Btn.click();
		
		Alert prompt_Alert = driver.switchTo().alert();
		String text = prompt_Alert.getText();
		System.out.println("Text : " + text);
		
		prompt_Alert.dismiss();
		
		
		
		
		
		
		
	}

}
