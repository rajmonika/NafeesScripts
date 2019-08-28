package TestNGConcepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int retryCount = 0;
	static final int maxRetryCount = 3;
	
		public boolean retry(ITestResult result) {

			if(retryCount < maxRetryCount)
			{
				retryCount++;
				return true;
			}
		return false;
	}

}
