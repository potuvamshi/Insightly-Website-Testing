package com.insightly.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.insightly.qa.base.SetProperty;
import com.insightly.qa.pages.LoginPage;
import com.insightly.qa.pages.WelcomePage;
@Listeners(com.insightly.qa.utility.CustomListner.class)
public class LoginPageTest extends SetProperty {
	LoginPage lp;
	public LoginPageTest(){
		super();
	}

	
	@BeforeMethod
	public void websiteLaunch() {
		browserIntialization();
		
	}
	@Test
	public void insigtlyLogin() throws InterruptedException  {
		lp=new LoginPage();
		new WelcomePage().goToLoginPage();
		Thread.sleep(5000);
		lp.userName(prop.getProperty("username"));
		lp.password(prop.getProperty("password"));
		lp.submitLogin();
		lp.userDropDownMenu();
		String actual=lp.verifyloginUser();
		Assert.assertEquals(actual, "Vamshikrishna Potu");
		System.out.println("Login Functionality Validated Successfully");
		
		//username=vamshikrishna453@gmail.com
				//password=Vamshi@123

	}
	@AfterMethod
	public void browserClose() {
		driver.close();
	}
}
