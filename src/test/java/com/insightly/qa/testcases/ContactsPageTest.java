package com.insightly.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.insightly.qa.base.SetProperty;
import com.insightly.qa.pages.ContactsPage;
import com.insightly.qa.pages.HomePage;
import com.insightly.qa.pages.LoginPage;
import com.insightly.qa.pages.WelcomePage;
import com.insightly.qa.utility.CheckContact;
import com.insightly.qa.utility.ExcelReader;
@Listeners(com.insightly.qa.utility.CustomListner.class)
public class ContactsPageTest extends SetProperty {
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void wesiteLogin() throws InterruptedException, IOException {
		browserIntialization();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		new WelcomePage().goToLoginPage();
		Thread.sleep(5000);
		lp.userName(prop.getProperty("username"));
		lp.password(prop.getProperty("password"));
		lp.submitLogin();
	
	}
	
	
	  @DataProvider
	  public Object[][] getContactsData() throws IOException {
	  
	  Object data[][] = new ExcelReader().getData();
	  
	  return data; 
	  }
	 
	
	@Test(dataProvider ="getContactsData")
	public void createNewContact(String prefix, String firName, String lasName, String mailID, String mobNum) throws InterruptedException, IOException 
	{
		new HomePage().goToContactsPage();
		ContactsPage cp=new ContactsPage();
		cp.createContact(prefix, firName, lasName, mailID, mobNum);
		cp.saveButton();
		Thread.sleep(2000);
		cp.closeCreateContact();
		boolean status=new CheckContact().contactValidate(mailID);
		Assert.assertEquals(status, true);
		System.out.println("Contacted added successfully");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
