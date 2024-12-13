import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest {



    @Test(dataProvider ="data")
    public void logintest(String email,String password) throws IOException, InterruptedException {
        LoginPage lp=new LoginPage(driver);
        lp.logininto(email,password);
    }
}
