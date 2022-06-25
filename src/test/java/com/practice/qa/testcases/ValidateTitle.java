package com.practice.qa.testcases;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.qa.base.TestBase;
import com.practice.qa.pages.LandingPage;

public class ValidateTitle extends TestBase{
	public WebDriver driver;
	public Properties prop;
	
	@Test
	
	public void verifyTitle(){
		//driver = initialization();
	
			LandingPage l = new LandingPage(driver, prop);
			Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
			
			
			Assert.assertTrue(l.getNavigationBar().isDisplayed());
			
         
}}
