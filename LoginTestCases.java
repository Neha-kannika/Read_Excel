package com.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTestCases {
	
	@Test
	void testLoginPage()
	{
		Logger logger=LogManager.getLogger(LoginTestCases.class);
		 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		logger.info("Open Chrome Browser"); 
		
        driver.get("https://practicetestautomation.com/practice-test-login/");
		logger.info("Open url"); 
		
        driver.findElement(By.id("username")).sendKeys("student");
         logger.info("Enter username in username field");
         
         
       driver.findElement(By.id("password")).sendKeys("Password123");
        logger.info("Enter password in password field"); 
		
		driver.findElement(By.id("submit")).click();
		logger.info("Click on login Button"); 
		
		
		driver.quit();
	}

		
		
	}


