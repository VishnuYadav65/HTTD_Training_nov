import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage extends lp{

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }


    @Test
    public void logininto(String email,String password) throws IOException, InterruptedException {
        System.out.println(email);
        System.out.println(password);

        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("userPassword")).sendKeys(password);
        driver.findElement(By.id("login")).click();
         Thread.sleep(10000);
//        driver.findElement(By.xpath("//button[@name='login']")).click();


    }
}

