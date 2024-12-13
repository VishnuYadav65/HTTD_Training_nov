package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prac {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://m.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");

        List<WebElement> points = driver.findElements(By.xpath("//div[@class='mx-2']/following-sibling::*[position()=5]"));
////     //   for loop and stream
//        List<Integer> p1 = points.stream().skip(1).map(p -> Integer.parseInt((p.getText()))).filter(p->p>8).toList();
////       points.stream().skip(1).filter(p ->Integer.parseInt(p.getText())
////               Integer.parseInt((p.getText())))
//        System.out.println(p1);
////
//        div[@class='text-xs']
        for(int i=1;i<points.size();i++){
            String Point = points.get(i).getText();
            int number =Integer.parseInt((points.get(i).getText()));

            if (number>8){
                System.out.println(points.get(i).findElement(By.xpath("preceding-sibling::div[@class='mx-2']")).getText());

            }

        }

    }
}







// for (WebElement point : points) {
//            System.out.println( point.getText());
//        }
//            List<WebElement> TeamName = driver.findElements(By.xpath("//div[@class='mx-2']/following-sibling::*[position()=5]/preceding::div[@class='mx-2']"));
//        for(WebElement team:TeamName){
//            System.out.println( team.getText());
//        }


//String Point = points.get(i).getText();
//            int number = Integer.parseInt(Point);
