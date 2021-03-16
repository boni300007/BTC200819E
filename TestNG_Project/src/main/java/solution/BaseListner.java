package solution;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListner implements ITestListener {

	public void onTestStart(ITestResult result) { // class name will print second
		// TODO Auto-generated method stub		  // method will print
		System.out.println(result.getName()+" is started 01"); // this will print again for second test
	}

	public void onTestSuccess(ITestResult result) { // after fist test finish this will print
		// TODO Auto-generated method stub          
		System.out.println(result.getName()+" is Success 02"); 
	}

	public void onTestFailure(ITestResult result) { // if any method is filed it will print
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is failed 03");
		System.out.println("call screenshot utility method 03");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is skipped 04");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getStatus() + " 05");
		
	}

	public void onStart(ITestContext context) { // test name will print fist
		// TODO Auto-generated method stub		// this will print aging for another test
		System.out.println(context.getName() + " is starting 06");
		
	}

	public void onFinish(ITestContext context) { // test name will print after test is done
		// TODO Auto-generated method stub
		System.out.println(context.getName() + " is finisied 07");
	}

}
