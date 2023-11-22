package genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementationm implements ITestListener{
	ExtentTest test;
	ExtentReports reports;
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.INFO,methodName+"execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS,methodName+"execution pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriverUtility WUTIL = new WebDriverUtility();
		JavaUtility JUTIL =new JavaUtility();
		String methodName = result.getMethod().getMethodName()+JUTIL.getDataCalender();
		test.log(Status.FAIL, methodName+"is failed");
		test.log(Status.FAIL,result.getThrowable());
		
		
			try {
			String path =WUTIL.screenShotCaptureMethod(BaseClass.driver, methodName);
			test.addScreenCaptureFromPath(path);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP,methodName+"is skipped");
		test.log(Status.SKIP,result.getThrowable());
		//this getThrowable will give you the exect status
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter(".\\extentReport\\report."
				+new JavaUtility().getDataCalender()+".html");
		htmlReport.config().setDocumentTitle("V tiger report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("extent report");
		//generate the report
		reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("browser","chrome");
		reports.setSystemInfo("author name","SAMIR KUMAR BEHATA");
		reports.setSystemInfo("platform", "windows");
		reports.setSystemInfo("url", "http://localhost:8888/");
		reports.setSystemInfo("enviornment name","Testing");
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
