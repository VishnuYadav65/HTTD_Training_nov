package TestCases;

import TestAbstractComponents.TestBaseClass;
import org.example.Pages.NumberOfPositions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class NumberOfPositionsTest extends TestBaseClass {
    @Test(dataProvider = "data")
    public void check(String s) throws InterruptedException {
        NumberOfPositions no = new NumberOfPositions(driver);
        no.check(s);
        Thread.sleep(5000);

    }

    @DataProvider
    public String[] data() {

        return new String[]{"0", "1", "99", "100"};

    }
}