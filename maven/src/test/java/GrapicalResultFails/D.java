package GrapicalResultFails;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D  implements  ITestListener{

	ExtentSparkReporter  htmll;
	ExtentReports rop;
	ExtentTest test;
	public void config()
	{
		htmll =new ExtentSparkReporter("ddd.html");
		rop = new ExtentReports();
		rop.attachReporter(htmll);
		htmll.config().setDocumentTitle("A");
		htmll.config().setReportName("B");
		htmll.config().setTheme(Theme.DARK);
	}

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

		test =rop.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("name of Succes test case is : " +result.getName(),ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		test =rop.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("name of fail test case is : " +result.getName(),ExtentColor.RED));
	}

	public void onTestSkipped(ITestResult result) {
		test =rop.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("name of Skipped test case is : " +result.getName(),ExtentColor.YELLOW));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		config();
	}

	public void onFinish(ITestContext context) {
		rop.flush();
	}


}
