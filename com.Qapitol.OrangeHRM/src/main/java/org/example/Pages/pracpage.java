package org.example.Pages;

import org.example.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class pracpage {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Thread.sleep(20000);
        Set<String> gg = driver.getWindowHandles();
        for (String g:gg){



        }
        System.out.println(gg);
        WebElement jobTitleDropdown=driver.findElement(By.xpath("//label[@class='oxd-label oxd-input-field-required']")) ;


        driver.findElement(with(By.tagName("input")).below(jobTitleDropdown)).sendKeys("Account Assitant");
    }
}

