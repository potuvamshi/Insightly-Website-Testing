package com.insightly.qa.utility;

import org.openqa.selenium.By;

import com.insightly.qa.base.SetProperty;

	
	public class CheckContact extends SetProperty {
		int i=1;
		boolean flag=false;
	public boolean contactValidate(String email) {
		while(true) {

		String email1=driver.findElement(By.xpath("//*[@id=\"gridListView\"]/div[2]/table/tbody/tr["+i+"]/td[6]")).getText();
		if (email1.equals(email)){
			flag=true;
			break;
		}
		i++;
		}
		return flag;
		

}
}