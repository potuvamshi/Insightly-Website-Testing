package com.insightly.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.insightly.qa.base.SetProperty;
import com.insightly.qa.pages.HomePage;
import com.insightly.qa.pages.LoginPage;
import com.insightly.qa.pages.WelcomePage;
@Listeners(com.insightly.qa.utility.CustomListner.class)
public class HomePageTest extends SetProperty {
	
	String page;
	public HomePageTest() {
		super();	
	}
	
	@BeforeMethod
	public void wesiteLogin() throws InterruptedException, IOException {
		browserIntialization();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		new WelcomePage().goToLoginPage();
		Thread.sleep(1000);
		lp.userName(prop.getProperty("username"));
		lp.password(prop.getProperty("password"));
		lp.submitLogin();
	
	}
	@Test(priority = 1)
	public  void goToTasksPage() {
		page=new HomePage().goToTasksPage();
		Assert.assertEquals(page, "Tasks - Insightly");
		System.out.println("Tasks Page Validated successfully");
	}
	@Test(priority = 2)
	public void goToContactsPage() {
		page=new HomePage().goToContactsPage();
		Assert.assertEquals(page, "ontacts - Insightly");
		System.out.println("Contacts Page Validated successfully");
	}
	@Test(priority = 3)
	public void goToOrganisationsPage() {
		page=new HomePage().goToOrganisationsPage();
		Assert.assertEquals(page, "Organizations - Insightly");
		System.out.println("Organizations Page Validated successfully");
	}
	@Test(priority = 4)
	public void goToLeadsPage() {
		page=new HomePage().goToLeadsPage();
		Assert.assertEquals(page, "Leads - Insightly");
		System.out.println("Leads Page Validated successfully");
	}
	@Test(priority = 5)
	public void goToOpportunitiesPage() {
		page=new HomePage().goToOpportunitiesPage();
		Assert.assertEquals(page, "pportunities - Insightly");
		System.out.println("Opportunities Page Validated successfully");
	}
	@Test(priority = 6)
	public void goToProjectsPage() {
		page=new HomePage().goToProjectsPage();
		Assert.assertEquals(page, "Projects - Insightly");
		System.out.println("Projects Page Validated successfully");
	}
	@Test(priority = 7)
	public void goToEmailsPage() {
		page=new HomePage().goToEmailsPage();
		Assert.assertEquals(page, "Emails - Insightly");
		System.out.println("Emails Page Validated successfully");
	}
	@Test(priority = 8)
	public void goToCalendersPage() {
		page=new HomePage().goToCalendersPage();
		Assert.assertEquals(page, "Events - Insightly");
		System.out.println("Events Page Validated successfully");
	}
	@Test(priority = 9)
	public void goToDashboardsPage() {
		page=new HomePage().goToDashboardsPage();
		Assert.assertEquals(page, "Dashboards - Insightly");
		System.out.println("Dashboards Page Validated successfully");
	}
	@Test(priority = 10)
	public void goToReportsPage() {
		page=new HomePage().goToReportsPage();
		Assert.assertEquals(page, "Report List - Insightly");
		System.out.println("Reports Page Validated successfully");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
