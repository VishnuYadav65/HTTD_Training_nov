package org.example.PageClass;

import org.example.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage extends BaseClass {


    public static void logininto() {
        intialization();
        driver.findElement(By.id("email")).sendKeys("weslee.aarion@domainsone.org");
        driver.findElement(By.id("pass")).sendKeys("Whatthef1@12");
        driver.findElement(By.xpath("//button[@name='login']")).click();


    }
}
