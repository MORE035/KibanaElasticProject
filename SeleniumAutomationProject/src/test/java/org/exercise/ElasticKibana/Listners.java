package org.exercise.ElasticKibana;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	PostRequest ps=new PostRequest();

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
		ps.TestCasePass(result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		ps.TestCaseFail(result.getTestName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

}
