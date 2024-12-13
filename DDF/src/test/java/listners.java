import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners implements ITestListener {
    ExtentTest test;
      ExtentReports extent=MyExtentReports.getReportObject();
   ThreadLocal extentTest=new ThreadLocal();


    public void onTestStart(ITestResult result) {
         test = extent.createTest(result.getMethod().getMethodName());
         System.out.println("y");
         extentTest.set(test);
    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,"Test Passed");

    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable()); //error message will print-get throwable method



    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
        extent.flush();

    }

}
