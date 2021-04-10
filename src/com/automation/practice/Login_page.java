package com.automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement signin_Btn;
	
	public Login_page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
		
	
	

}
