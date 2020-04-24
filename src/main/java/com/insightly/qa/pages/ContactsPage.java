package com.insightly.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insightly.qa.base.SetProperty;

public class ContactsPage extends SetProperty {

	@FindBy(xpath = "//*[@id=\"AddNewButton\"]/a")
	WebElement createContact;
	@FindBy(xpath = "//*[@id=\"Contact_SALUTATION\"]")
	WebElement namePrefix;
	@FindBy(xpath = "//*[@id=\"Contact_FIRST_NAME\"]")
	WebElement firstName;
	@FindBy(xpath = "//*[@id=\"Contact_LAST_NAME\"]")
	WebElement lastName;
	@FindBy(xpath = "//*[@id=\"Contact_EMAIL_ADDRESS\"]")
	WebElement eMail;
	@FindBy(xpath = "//*[@id=\"Contact_PHONE_MOBILE\"]")
	WebElement mobileNumber;
	@FindBy(xpath = "//*[@id=\"btn-save\"]")
	WebElement saveButton;
	@FindBy(xpath = "//*[@id=\"modal-close-tab\"]")
	WebElement coloseCreateContact;
	
	public ContactsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
	
	public void createContact(String prefix, String firName, String lasName, String mailID, String mobNum) throws InterruptedException {

		createContact.click();
		Thread.sleep(2000);
		namePrefix.sendKeys(prefix);
		firstName.sendKeys(firName);
		lastName.sendKeys(lasName);
		eMail.sendKeys(mailID);
		mobileNumber.sendKeys(mobNum);
		
	}
	public void saveButton(){
		saveButton.click();
	}
	
	public void closeCreateContact() {
		coloseCreateContact.click();
	}
}
