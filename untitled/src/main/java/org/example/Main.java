package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://m.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
        List<WebElement> points = driver.findElements(By.xpath("//div[@class='grid point-table-grid p-2']/child::div[@class='mx-2']/following-sibling::*[position()=5]"));
//        for(WebElement point:points){
//            System.out.println(point.getText());
//        }
//        System.out.println(points.size());
        String TeamName = "";
        int a=8;
        for(int i=1;i<points.size();i++) {
            int p = Integer.parseInt(points.get(i).getText());
//            WebElement Realpoint = points.get(i);
//            String point = points.get(i).getText();
////            System.out.println(point);
//            int P=Integer.parseInt(point);
//            System.out.println("...."+p);
            if(p>a){
                System.out.println(p);
                System.out.println(i);
                System.out.println();
                TeamName=  points.get(i).findElement(By.xpath("//div[@class='grid point-table-grid p-2']/child::div[@class='mx-2']/following-sibling::*[position()=5]/preceding-sibling::div[@class='mx-2']/child::a/child::div[@class='text-xs']")).getText();
//                TeamName = Realpoint.findElement(By.xpath("//div[@class='grid point-table-grid p-2']/child::div[@class='mx-2']/following-sibling::*[position()=5]/preceding-sibling::div[@class='mx-2']/child::a")).getText();
                System.out.println(TeamName);

            }

        }

//        System.out.println(TeamName);




    }
}