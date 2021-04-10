package selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Task {
	
	public static void main(String[] args) throws InterruptedException   {
		
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
		emailId.sendKeys("xyz123@gmail.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='passwd']"));
		passWord.sendKeys("Forever@123");
		
		WebElement signBt = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signBt.click();
		
		WebElement emailCrt = driver.findElement(By.xpath("//input[@id='email_create']"));
		emailCrt.sendKeys("dineshjd0494@gmail.com");
		
		WebElement crtAccBtn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		crtAccBtn.click();
		Thread.sleep(5000);
		
		WebElement title = driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
		title.click();
		
		WebElement fName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		fName.sendKeys("Dinesh");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastName.sendKeys("Kumar");
		
		WebElement passWd = driver.findElement(By.xpath("//input[@id='passwd']"));
		passWd.sendKeys("Dineshjd@04");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("4");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.name("months"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("November ");
		Thread.sleep(3000);

		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1994");
		Thread.sleep(3000);
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("TCS");
		
		WebElement adrs1 = driver.findElement(By.xpath("//input[@id='address1']"));
		adrs1.sendKeys("No.8 Krishnappa naykar colony");
		
		WebElement adrs2 = driver.findElement(By.xpath("//input[@id='address2']"));
		adrs2.sendKeys("Gopal naykar nagar, padi ");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("chennai");
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select s3 = new Select(state);
		s3.selectByVisibleText("California");
		Thread.sleep(3000);
		
		WebElement post = driver.findElement(By.id("postcode"));
		post.sendKeys("00000");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select s4 = new Select(country);
		s4.selectByVisibleText("United States");
		Thread.sleep(3000);
		
		WebElement addinfo = driver.findElement(By.name("other"));
		addinfo.sendKeys("Near KSP Mahal");
		
		WebElement phone1 = driver.findElement(By.xpath("//input[@id='phone']"));
		phone1.sendKeys("9043514492");
		
		WebElement phone2 = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		phone2.sendKeys("9043514493");
		
		WebElement aliasAdd = driver.findElement(By.xpath("//input[@id='alias']"));
		aliasAdd.sendKeys("chennai");
		
		WebElement regBtn = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		regBtn.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
