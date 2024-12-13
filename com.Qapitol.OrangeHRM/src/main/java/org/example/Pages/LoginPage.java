package org.example.Pages;

import org.example.BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (name = "username")
    WebElement Username;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement Submit;

    public  void login() {

        Username.sendKeys("Admin");
        Password.sendKeys("admin123");
        Submit.click();

       //Successfull Login

    }
}
