package com.insightly.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	WebDriver driver;
	@BeforeMethod
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/Selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.insightly.com/");
	}
	
	@Test
	public void getTitleOfPage() {
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
