package com.practice.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.practice.qa.util.TestUtil;



public class TestBase {

	public static  WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"E:\\SeleniumPractice\\AAPracticeFw\\src\\main\\java\\com\\practice\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException i) {
			i.printStackTrace();
		}

	}

	@BeforeTest
	public static WebDriver initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\DriverChrome96\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
			else if(browserName.equalsIgnoreCase("FF")) {
				
				System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.page_load_timeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.implicit_wait));
			driver.get(prop.getProperty("url"));
			return driver;
			

		}
	
@AfterTest
	
	public static void tearDown() {
		driver.close();
	}
	
	}

