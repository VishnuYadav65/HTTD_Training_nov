package org.example.Pages;

import org.example.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RecuitmentPage  extends BaseClass {

    WebDriver driver;

    public RecuitmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[.='Recruitment']")
    WebElement Recruitment;

    @FindBy(xpath = "//li[.='Vacancies']")
    WebElement Vacancies;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement JobTitle;

    @FindBy(xpath = "//div[@class='oxd-select-option']")
    List<WebElement> JobTitledropdown;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement hiringManagerField;

    @FindBy(xpath = "//div[@class='oxd-autocomplete-option']")
    List<WebElement> HiringManager;


    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;


    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement Add;

    public void addVacancies() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Recruitment']")));
        Recruitment.click();
        Vacancies.click();
        Add.click();

        WebElement jobTitleDropdown = driver.findElement(By.xpath("//label[@class='oxd-label oxd-input-field-required']"));
        driver.findElement(with(By.tagName("input")).below(jobTitleDropdown)).sendKeys("Test56");


        JobTitle.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait1.until(ExpectedConditions.visibilityOfAllElements(JobTitledropdown));
Thread.sleep(3000);
        for (WebElement JT : JobTitledropdown) {
//            wait1.until(ExpectedConditions.visibilityOf(JT));
            if (JT.getText().equalsIgnoreCase("QA Lead")) {
//                System.out.println("9");
                JT.click();
                wait.until(ExpectedConditions.invisibilityOf((JT)));
                break;
            }
        }
        hiringManagerField.sendKeys("FNC");
        driver.findElement(By.xpath("//*[text()='FNCypressTest akhil LNCypressTest']")).click();
        saveButton.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='oxd-toast-icon-container']"))));
        System.out.println( driver.findElement(By.xpath("//div[@class='oxd-toast-icon-container']")).getText());

    }
}



//        WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait1.until(ExpectedConditions.visibilityOfAllElements(HiringManager));
//        for(WebElement HM:  HiringManager) {
//            wait1.until(ExpectedConditions.visibilityOfAllElements(HM));
////            wait1.until(ExpectedConditions.visibilityOfAllElements(HiringManager));
//            if (HM.getText().contains("abcd efgh ijkl")) {
////              WebDriverWait wait=new WebDriverWait(driver,5);
//              Thread.sleep(5000);
//              HM.click();
//                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='oxd-autocomplete-option']")));
//               System.out.println("1");
//              break;
//
//          }  System.out.println("2");




