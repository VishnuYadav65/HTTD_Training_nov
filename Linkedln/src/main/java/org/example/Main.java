package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<String> Result = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException, IOException {

        String Designation = "";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.findElement(By.id("username")).sendKeys("srivishnuyadav2000@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Whatthefuck1@12");
        driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
//        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Madhuri Kumari" + Keys.chord(Keys.ENTER));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='See all people results'])[1]")));
        driver.findElement(By.xpath("(//*[text()='See all people results'])[1]")).click();
////a[@href='https://www.linkedin.com/in/madhuri-kumari-266a38161?miniProfileUrn=urn%3Ali%3Afs_miniProfile%3AACoAACbGMm4B5iy-NmA9kTG-cOQ-HQZxcTSAUbQ']
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='t-roman t-sans']"));
        List<WebElement> List1 = driver.findElements(By.xpath("//*[starts-with(@class, 'LcxqaAQEXzuaApsdzTmCwdbKdNUirxSyIw')]"));

        String Name;
        String result = "";

//span//a

        List<String> list3 = new ArrayList<>();
        List list4 = new ArrayList<>();
        for (WebElement lis1 : list) {
            String FullName = lis1.getText();
            String[] hh = FullName.split("View");

            Name = hh[0];

            list3.add(Name);
        }
        for (WebElement s1 : List1) {
            Designation = s1.getText();

            list4.add(Designation);


        }
        for (int i = 0; i < list3.size(); i++) {
            result = list3.get(i) + list4.get(i);
            Result.add(result);
        }

        System.out.println(Result);

        writeexcel();
    }
        public static void writeexcel() throws IOException {
            File file=new File("C:\\Users\\Qapitol QA\\IdeaProjects\\Linkedln\\src\\main\\resources\\Book 2.xlsx");
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 0; i < Result.size(); i++) {
            Row row = sheet.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(Result.get(i));
        }
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            workbook.close();

        }

    }