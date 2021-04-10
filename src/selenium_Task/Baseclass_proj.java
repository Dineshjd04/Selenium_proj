package selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Baseclass_proj extends Base_class{
	
	public static void main(String[] args) throws Throwable {
		
		bLaunch("chrome", "http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickonElement(signin);
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
		inputvalueElement(emailId, "dineshjd0494@gmail.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='passwd']"));
		inputvalueElement(passWord, "Dineshjd@04");
		
		WebElement signBt = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		clickonElement(signBt);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		ac(women, "move");
		
		WebElement tShirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		clickonElement(tShirt);
		
		WebElement check = driver.findElement(By.name("layered_id_attribute_group_2"));
		clickonElement(check);
		
		WebElement colour = driver.findElement(By.name("layered_id_attribute_group_14"));
		clickonElement(colour);
		
		WebElement cotton = driver.findElement(By.id("layered_id_feature_5"));
		clickonElement(cotton);
		
		WebElement casual = driver.findElement(By.id("layered_id_feature_11"));
		clickonElement(casual);
		
		WebElement shortSleev = driver.findElement(By.id("layered_id_feature_17"));
		clickonElement(shortSleev);
		
		WebElement inStock = driver.findElement(By.id("layered_quantity_1"));
		clickonElement(inStock);
		
		WebElement fashionManu = driver.findElement(By.id("layered_manufacturer_1"));
		clickonElement(fashionManu);
		
		WebElement newCollection = driver.findElement(By.id("layered_condition_new"));
		clickonElement(newCollection);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement stock = driver.findElement(By.xpath("//span[@class='available-now']"));
		clickonElement(stock);
		//act.moveToElement(stock).build().perform();
		
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		clickonElement(addtocart);
		Thread.sleep(5000);
		
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		clickonElement(checkout);
		
		WebElement checkout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		clickonElement(checkout2);
		
		WebElement checkout3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		clickonElement(checkout3);
		
		WebElement agreeBtn = driver.findElement(By.id("cgv"));
		clickonElement(agreeBtn);
		
		WebElement checkout4 = driver.findElement(By.name("processCarrier"));
		clickonElement(checkout4);
		
		
		
		
		
	}

}
