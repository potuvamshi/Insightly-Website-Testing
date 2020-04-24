package com.insightly.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insightly.qa.base.SetProperty;

public class LoginPage extends SetProperty {
	
	@FindBy(xpath = "//*[@id='emailaddress']")
	WebElement username;
	@FindBy(xpath = "//*[@id=\"login-form\"]/form/input[3]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement loginButton;
	@FindBy(xpath="//*[@id=\"userMenu\"]/div")
	WebElement userMenu;
	@FindBy(xpath = "//*[@id=\"userMenu\"]/div/ul/li[1]/div/div/div[2]/div[1]")
	WebElement verifyUser;
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	  
	
	public void userName(String usn) {
		
		System.out.println("userName="+usn);
		username.sendKeys(usn);
	}
	public void password(String pass) {
		//PageFactory.initElements(driver, this);
		System.out.println("Password="+pass);
		password.sendKeys(pass);
	}
	
	public void submitLogin() {
		//PageFactory.initElements(driver, this);
		System.out.println("click on submit");
		loginButton.click();
	}
	public void userDropDownMenu() {
		
		userMenu.click();
	}
	public String verifyloginUser() {
		return verifyUser.getText();
		
		
	}
}	

