package com.insightly.qa.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.insightly.qa.base.SetProperty;

public class TakeScreenShot extends SetProperty {
	
	public void screenShotOfFailedTestCase(String name) {
		
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("D:\\Java programming Eclips\\Insightly\\src\\test\\java\\FaildTestCaseScreenShots\\"+name+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
