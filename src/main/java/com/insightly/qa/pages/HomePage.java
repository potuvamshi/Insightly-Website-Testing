package com.insightly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insightly.qa.base.SetProperty;

public class HomePage extends SetProperty {
	@FindBy(xpath = "//*[@id=\"navlink_task\"]")
	WebElement TasksLink;
	@FindBy(xpath = "//*[@id=\"navlink_contact\"]")
	WebElement ContactsLink;
	@FindBy(xpath = "//*[@id=\"navlink_organisation\"]")
	WebElement organisationsLink;
	@FindBy(xpath = "//*[@id=\"navlink_lead\"]")
	WebElement leadsLink;
	@FindBy(xpath = "//*[@id=\"navlink_opportunity\"]")
	WebElement opportunitiesLink;
	@FindBy(xpath = "//*[@id=\"navlink_project\"]")
	WebElement projectsLink;
	@FindBy(xpath = "//*[@id=\"navlink_email\"]")
	WebElement emailsLink;
	@FindBy(xpath = "//*[@id=\"navlink_event\"]")
	WebElement calenderLink;
	@FindBy(xpath = "//*[@id=\"navlink_dashboard\"]")
	WebElement dashboardsLink;
	@FindBy(xpath = "//*[@id=\"navlink_report\"]")
	WebElement reportsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String goToTasksPage() {
		TasksLink.click();
		return driver.getTitle();
	}

	public String goToContactsPage() {
		ContactsLink.click();
		return driver.getTitle();
	}
	public String goToOrganisationsPage() {
		organisationsLink.click();
		return driver.getTitle();
	}
	public String goToLeadsPage() {
		leadsLink.click();
		return driver.getTitle();
	}
	public String goToOpportunitiesPage() {
		opportunitiesLink.click();
		return driver.getTitle();
	}
	public String goToProjectsPage() {
		projectsLink.click();
		return driver.getTitle();
	}
	public String goToEmailsPage() {
		emailsLink.click();
		return driver.getTitle();
	}
	public String goToCalendersPage() {
		calenderLink.click();
		return driver.getTitle();
	}
	public String goToDashboardsPage() {
		dashboardsLink.click();
		return driver.getTitle();
	}
	public String goToReportsPage() {
		reportsLink.click();
		return driver.getTitle();
	}

	
}
