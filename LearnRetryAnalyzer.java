package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnRetryAnalyzer implements IRetryAnalyzer{
	int retryCount=0;

	public boolean retry(ITestResult arg0) {
		if (retryCount<3) {
			retryCount++;
			return true;
		}
		return false;
	}
	

}
