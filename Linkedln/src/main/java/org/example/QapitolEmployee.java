package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class QapitolEmployee {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.findElement(By.id("username")).sendKeys("+91 7815806429");
        driver.findElement(By.id("password")).sendKeys("Whatthefuck1@12");
        driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("qapitol qa" + Keys.chord(Keys.ENTER));
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/qapitol-qa/']")).click();

        driver.findElement(By.xpath("//a[@href='/company/qapitol-qa/people/']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
//        driver.findElement(By.xpath("//a[@aria-current='page']")).click();
        List<WebElement> list = driver.findElements(By.xpath("//div/div[@class='artdeco-entity-lockup__content ember-view']/child::div[1]"));

        for (WebElement l : list)
            System.out.println(l.getText());


//    }
//    public  void scroll(int val, int val1){
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy("+val+","+val1+")");
//
//
//    }
    }
}
