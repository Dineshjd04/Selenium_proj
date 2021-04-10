package com.automation.practice;

import org.openqa.selenium.WebDriver;
import selenium_Task.Base_class;

public class Shopping_Purchase extends Base_class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = getBrowser("chrome");
		
		get("http://automationpractice.com/index.php");
		
		Home_Page home = new Home_Page(driver);
		clickonElement(home.getSignin_Btn());
		
		Login_page login = new Login_page(driver);
		
		inputvalueElement(login.getEmail(), "dineshjd0494@gmail.com");
		
		inputvalueElement(login.getPassword(), "Dineshjd@04");
		
		clickonElement(login.getSignin_Btn());
		
		ac(Page_1.getWomen(), "move");
		
		
	}

	private static WebDriver getBrowser(String string) {
		return null;
	}
	
	}
	
	


