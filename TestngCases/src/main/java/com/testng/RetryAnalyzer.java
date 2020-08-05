package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
int startcount=0;
int endcount=4;

public boolean retry(ITestResult result) {
if(startcount<endcount) {
	startcount++;
	return true;
}
	
	return false;
	}
}
