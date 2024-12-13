import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class bb {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
        List<WebElement> AllTeams= driver.findElements(By.xpath("//a[@class='cb-text-link']//div[@class='cb-col cb-col-84']"));
        List<WebElement> Points = driver.findElements(By.xpath("//td[@class='cb-srs-pnts-td text-bold']"));
        for (int i = 0; i < Points.size(); i++)
        {
            int points = Integer.parseInt(Points.get(i).getText());
            if(points>=9) {
                System.out.println(AllTeams.get(i).getText());
            }
        }

    }
}

