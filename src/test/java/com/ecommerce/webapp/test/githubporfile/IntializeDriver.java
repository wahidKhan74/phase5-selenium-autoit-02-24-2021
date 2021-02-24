package com.ecommerce.webapp.test.githubporfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntializeDriver {
	
	final static String driverPath = "C:\\Users\\HOME\\Desktop\\Siimplilearn\\phase5-selenium-autoit-02-24-2021\\drivers\\chromedriver.exe";
	static WebDriver driver;
	
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//set driver instance
		RunTimeDriver.setDriver(driver);
	}
}
