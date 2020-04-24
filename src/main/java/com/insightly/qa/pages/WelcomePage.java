package com.insightly.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insightly.qa.base.SetProperty;

public class WelcomePage extends SetProperty {
	
	@FindBy(xpath = "//*[@id=\"nav-login\"]")
	WebElement loginpage;
	@FindBy(xpath = "//*[@id=\"header-links\"]/a[2]/button")
	WebElement RegistrationPage;
	
	public WelcomePage() {
		 PageFactory.initElements(driver, this);
	}
	 
	public String pageTitle() {
		
		return driver.getTitle();
	}
	
	public void goToLoginPage() {
		//driver.findElement(By.xpath("//*[@id=\"nav-login\"]")).click();
		System.out.println("goto Login Page called");
		loginpage.click();
	}
	public void goToRegistrationPage() {
		RegistrationPage.click();
	}
}
