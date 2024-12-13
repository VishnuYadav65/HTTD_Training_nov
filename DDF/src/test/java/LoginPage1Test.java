import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage1Test extends BaseTest {



    @Test(dataProvider ="data")
    public void logintest(String email,String password) throws IOException, InterruptedException {
        LoginPage lp=new LoginPage(driver);
        lp.logininto(email,password);
    }
}
