package com.ecommerce.webapp.test.githubporfile;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class GithubUserProfileUploadTest {

	@BeforeEach
	void setUp() throws Exception {
		IntializeDriver.setUp();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testForUploadUserProfile() throws InterruptedException, IOException {
		WebDriver driver = RunTimeDriver.getDriver();
		
		LoginUserToGithub.userLogin();
		
		Thread.sleep(5000);
		driver.get("https://github.com/settings/profile");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary")).click();
		
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label")).click();
		
		// upload file with windows automation with autoIT
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIT\\upload-profile.exe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
