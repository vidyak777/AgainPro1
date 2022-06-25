package com.practice.qa.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.practice.qa.base.TestBase;
import com.practice.qa.pages.LandingPage;
import com.practice.qa.pages.LoginPage;

public class VerifyHomePage extends TestBase {

	@Test(dataProvider= "getData")
	public void basePageNavigation(String username, String password) throws IOException, InterruptedException {
	//	driver = initialization();
		//driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		LandingPage l = new LandingPage(driver, prop);

		l.getLogin().click();

		LoginPage lp = new LoginPage(driver, prop);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	
	}
	
@DataProvider
	
	public Object[][] getData() {
		
		Object [][] data= new Object[2][2];
		data [0][0]= "nonrestrictedusers@qw.com";
		data [0][1]="123456";
		
		data [1][0]= "vidyakale8816@gmail.com";
		data [1][1]="test@777";
	
		return data;
	}

	
}
	


