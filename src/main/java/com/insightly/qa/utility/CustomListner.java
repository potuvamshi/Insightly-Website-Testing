package com.insightly.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.insightly.qa.base.SetProperty;

public class CustomListner extends SetProperty implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting "+result.getName()+" Test Case");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Test Case executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Test Case Failed");
		System.out.println("Taking Screen Shot");
		String nameOfFailedMethod=result.getName();
		TakeScreenShot ob=new TakeScreenShot();
		ob.screenShotOfFailedTestCase(nameOfFailedMethod);
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Test Case Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
