package org.example;

import org.openqa.selenium.By;

import java.io.IOException;

import static org.example.Base.driver;
import static org.example.Base.intialization;

public class LoginPage extends Base {

    public static void logininto() throws IOException {

        String userDir = System.getProperty("user.dir");
        // Construct the path to the properties file relative to the project root directory
        String filePath = userDir + "\\src\\test\\java\\Bookdata.xlsx";
        String data = String.valueOf(ExcelUtil.readCellDataByHeader(filePath,"Name",0));
        System.out.println(data);

        intialization();
        driver.findElement(By.id("email")).sendKeys("weslee.aarion@domainsone.org");
        driver.findElement(By.id("pass")).sendKeys("Whatthef1@12");
        driver.findElement(By.xpath("//button[@name='login']")).click();


    }
}
