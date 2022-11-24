package TestCase;

import Hooks.TestBase;
import PageObjectFactory.LoginPage;
import UTILITIES.ConfigurationReader;
import org.testng.annotations.Test;

public class Login extends TestBase {
    @Test

    //chiamo il POF LoginPage

    public void loginlazio() throws InterruptedException {
        LoginPage loginPage= new LoginPage();
        driver.get(ConfigurationReader.get("urllazio"));
        loginPage.logintomainpage();


    }
    @Test
    public void logincaso() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        driver.get(ConfigurationReader.get("urlcaso"));
        loginPage.logintomainpage();
    }
}
