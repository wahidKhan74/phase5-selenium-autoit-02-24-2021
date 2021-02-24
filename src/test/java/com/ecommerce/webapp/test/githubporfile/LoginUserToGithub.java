package com.ecommerce.webapp.test.githubporfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUserToGithub {
	
	public static void userLogin() {
		
		WebDriver driver = RunTimeDriver.getDriver();
		final String siteURL = "https://github.com/login";
		
		driver.get(siteURL);
		
		driver.findElement(By.id("login_field")).sendKeys(LoginCredential.username);
		driver.findElement(By.id("password")).sendKeys(LoginCredential.password);
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/input[14]")).submit();
	}
}
