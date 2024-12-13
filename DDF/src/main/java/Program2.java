import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
@Test()
public void lp(String email,String password){

    WebDriver driver=new ChromeDriver();
    driver.get("http://139.59.27.246:3000/login");
    driver.findElement(By.id("userNameOrEmail")).sendKeys(email);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
}

@DataProvider
public Object[][] d() throws IOException {
    ExcelUtil excelUtil=new ExcelUtil();
    return excelUtil.getData();

}

public void main() {
}
