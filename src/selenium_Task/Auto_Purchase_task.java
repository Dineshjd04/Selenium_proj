package selenium_Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_Purchase_task extends Base_class{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, Throwable {
		
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		Thread.sleep(3000);
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
		emailId.sendKeys("dineshjd0494@gmail.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='passwd']"));
		passWord.sendKeys("Dineshjd@04");
		
		WebElement signBt = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signBt.click();
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		
		WebElement tShirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		tShirt.click();
		
		WebElement check = driver.findElement(By.name("layered_id_attribute_group_2"));
		check.click();
		
		WebElement colour = driver.findElement(By.name("layered_id_attribute_group_14"));
		colour.click();
		
		WebElement cotton = driver.findElement(By.id("layered_id_feature_5"));
		cotton.click();
		
		WebElement casual = driver.findElement(By.id("layered_id_feature_11"));
		casual.click();
		
		WebElement shortSleev = driver.findElement(By.id("layered_id_feature_17"));
		shortSleev.click();
		
		WebElement inStock = driver.findElement(By.id("layered_quantity_1"));
		inStock.click();
		
		WebElement fashionManu = driver.findElement(By.id("layered_manufacturer_1"));
		fashionManu.click();
		
		WebElement newCollection = driver.findElement(By.id("layered_condition_new"));
		newCollection.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement stock = driver.findElement(By.xpath("//span[@class='available-now']"));
		act.moveToElement(stock).build().perform();
		
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();
		Thread.sleep(5000);
		
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkout.click();
		
		WebElement checkout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		checkout2.click();
		
		WebElement checkout3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		checkout3.click();
		
		WebElement agreeBtn = driver.findElement(By.id("cgv"));
		agreeBtn.click();
		
		WebElement checkout4 = driver.findElement(By.name("processCarrier"));
		checkout4.click();
		
	
	}

}
