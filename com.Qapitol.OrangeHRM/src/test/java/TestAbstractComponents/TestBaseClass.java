package TestAbstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.time.Duration;

public class TestBaseClass {
    public static WebDriver driver;
    @BeforeMethod
    public void Goto(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }
//@AfterMethod
//    public void tearDown(){
//        driver.close();
//    }


}

