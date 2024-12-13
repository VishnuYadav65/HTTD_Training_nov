import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

//public static WebDriver driver;
 WebDriver    driver;
@BeforeMethod
    public  void intialization()
{

driver=new ChromeDriver();
        driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/client");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @AfterMethod
    public void teardown(){
    driver.quit();
    }

    @DataProvider
    public Object[][] data() throws IOException {
        ExcelUtil excelUtil=new ExcelUtil();
        return excelUtil.getData();

    }

}
