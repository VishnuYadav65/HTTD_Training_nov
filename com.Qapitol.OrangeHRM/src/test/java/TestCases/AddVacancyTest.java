package TestCases;

import TestAbstractComponents.TestBaseClass;
import org.example.Pages.LoginPage;
import org.example.Pages.RecuitmentPage;
import org.testng.annotations.Test;

public class AddVacancyTest extends TestBaseClass {

    @Test
    public void addvacancy() throws InterruptedException {


    LoginPage LP = new LoginPage(driver);
    LP.login();
    RecuitmentPage RP = new RecuitmentPage(driver);
    RP.addVacancies();



}
}
