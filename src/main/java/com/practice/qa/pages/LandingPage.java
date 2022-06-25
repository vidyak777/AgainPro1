package com.practice.qa.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.practice.qa.base.TestBase;

public class LandingPage extends TestBase{
	public WebDriver driver;
	public Properties prop;
	
	By login = By.xpath("//span[text()='Login']");
	By title = By.xpath("//div[@class='text-center']//h2");
	By navBar = By.cssSelector(".container");
	
	public LandingPage(WebDriver driver, Properties prop) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.prop = prop;
	}


	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar() {
		return driver.findElement(navBar);
	}
}
