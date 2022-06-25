package com.practice.qa.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	public Properties prop;
	
	By email = By.xpath("//input[@id='user_email']"); 
	By password = By.xpath("//input[@id='user_password']");
	By loginbtn = By.xpath("//input[@type='submit']");
	
	public LoginPage(WebDriver driver, Properties prop) {
		
		this.driver=driver;
		this.prop = prop;
	}
	
	public WebElement getEmail(){
		
		return driver.findElement(email);
				
	}
public WebElement getPassword(){
		
		return driver.findElement(password);
				
	}

public WebElement getLogin(){
	
	return driver.findElement(loginbtn);
			
}
}
