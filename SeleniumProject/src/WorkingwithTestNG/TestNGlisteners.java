package WorkingwithTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlisteners implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
System.out.println("TC fininsh results are"+result.getName());		
	}

	@Override
	public void onStart(ITestContext result) {
System.out.println("TC start result is"+result.getName());		
	}
	@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
System.out.println("TC failedbutSucc percent"+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("TC Failure results are"+result.getName());		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
System.out.println("TC skipped results are"+result.getName());		
	}
	@Override
	public void onTestStart(ITestResult result) {
System.out.println("TC start results are"+result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC Succ rersults are"+result.getName());
	}
	
	
	
	

}
