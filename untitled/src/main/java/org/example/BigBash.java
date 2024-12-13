package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BigBash {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Thread.sleep(5000);

        driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
//       xpath="//div[@class='cb-col cb-col-84']"
        List<WebElement> AllTeams= driver.findElements(By.xpath("//a[@class='cb-text-link']//div[@class='cb-col cb-col-84']"));
        List<WebElement> Points = driver.findElements(By.xpath("//td[@class='cb-srs-pnts-td text-bold']"));
        for (int i = 0; i < Points.size(); i++)
        {
            int points = Integer.parseInt(Points.get(i).getText());
            if(points>=9) {
                System.out.println("Top 4 Teams "+AllTeams.get(i).getText());
            }
        }

    }

}
