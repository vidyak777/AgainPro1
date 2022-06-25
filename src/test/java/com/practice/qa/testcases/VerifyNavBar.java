package com.practice.qa.testcases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.qa.base.TestBase;
import com.practice.qa.pages.LandingPage;

public class VerifyNavBar extends TestBase {
	public WebDriver driver;
	public Properties prop;
	
	@Test
	
	public void verifyNavBar(){
		//driver = initialization();
	
			LandingPage l = new LandingPage(driver, prop);
				
			Assert.assertTrue(l.getNavigationBar().isDisplayed());

}}
