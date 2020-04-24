package com.insightly.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetProperty {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public SetProperty() {
		System.out.println("SetProperty constructor called");
		prop= new Properties();
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("D:\\Java programming Eclips\\Insightly\\src\\main\\java\\com\\insightly\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fi);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void browserIntialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vamshi Potu\\git\\InsightlyWesiteTesting\\Insightly\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		
		
	}
	
}
