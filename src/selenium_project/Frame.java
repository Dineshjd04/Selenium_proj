package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(5000);
		
		// to swith over to the frame
		driver.switchTo().frame("singleframe");
		
		WebElement sText = driver.findElement(By.xpath("//input[@type='text']"));
		sText.sendKeys("IFrame");
		
		driver.switchTo().defaultContent();
		
		WebElement iButton = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iButton.click();
		
		WebElement oFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(oFrame);
		
		WebElement inFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inFrame);
		
		Thread.sleep(2000);
		
		WebElement iText = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		iText.sendKeys("InnerFrame");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000, 3);
		
		driver.quit();
		
		
		
		
		
		
		
			
		
	}

}
