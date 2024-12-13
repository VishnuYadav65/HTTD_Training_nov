import org.example.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest{

@Test
public void lptest() throws IOException {

    LoginPage loginpage = new LoginPage();
    loginpage.logininto();

}
}
