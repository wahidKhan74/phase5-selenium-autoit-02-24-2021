package com.ecommerce.webapp.test.phase5_selenium_autoit_02_24_2021;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class UploadUserProfileTest {

	final String siteURL = "file:///C:/Users/HOME/Desktop/Siimplilearn/phase5-selenium-autoit-02-24-2021/static/user-profile-upload.html";
	final String driverPath = "C:\\Users\\HOME\\Desktop\\Siimplilearn\\phase5-selenium-autoit-02-24-2021\\drivers\\chromedriver.exe";
	WebDriver driver;
	
	@BeforeEach
	void setUpForDriverAndBrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(siteURL);
	}

	@AfterEach
	void tearDown() {
		driver.close();
	}

	@Test
	@DisplayName("Test :: User Porfile Upload")
	void testUserProfileUpload() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("admin123");
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("profile")).sendKeys("Solution Architect");
		driver.findElement(By.id("address")).sendKeys("ABC Complex , ABC Lane");
		
		Thread.sleep(3000);
		
		WebElement fileInput = driver.findElement(By.id("file-upload"));
		fileInput.sendKeys("E:\\response.png");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).submit();
	}

}
