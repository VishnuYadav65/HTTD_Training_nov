package org.example.BaseClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class BaseClass {
  public static WebDriver driver;

    public static void intialization() {
       driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }
}

