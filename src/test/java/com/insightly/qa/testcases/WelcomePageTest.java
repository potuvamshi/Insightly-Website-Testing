package com.insightly.qa.testcases;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.insightly.qa.base.SetProperty;
import com.insightly.qa.pages.WelcomePage;


@Listeners(com.insightly.qa.utility.CustomListner.class)
public class WelcomePageTest extends SetProperty {
	
	Logger log=LogManager.getLogger(WelcomePageTest.class);
	
	
	public WelcomePageTest() throws InterruptedException, IOException{
		super();
	}

	WelcomePage wp=new WelcomePage();
	@BeforeMethod
	public void websiteLaunch() {
		log.info("Opening The Browser");
		browserIntialization();
		log.info("Browser Initialized");
	}
	
	@Test
	public void welcomePageTitle() {
		log.info("Verifying the Title");
		String actual=wp.pageTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "CRM Software CRM Platform Marketing Automation | Insightly");
		System.out.println("findWelcomePageTitle is validated successfully");
		log.info("Verifyed the Title");
	}
	
	@AfterMethod
	public void closeBrowser() {
		log.info("Closing the Browser");
		driver.close();
	}

}
