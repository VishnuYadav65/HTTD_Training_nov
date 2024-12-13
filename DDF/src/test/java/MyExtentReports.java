
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class MyExtentReports {

    static ExtentReports extent;

    public static ExtentReports getReportObject() {

        String path1="C:\\Users\\Qapitol QA\\IdeaProjects\\DDF\\src\\test";
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter reporter=new ExtentSparkReporter(path1);
        reporter.config().setReportName("Facebook Automation Results");
        reporter.config().setDocumentTitle("login Page results");

        extent=new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Vishnu");
        return extent;

    }
}