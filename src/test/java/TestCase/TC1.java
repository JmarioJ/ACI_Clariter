package TestCase;

import UTILITIES.WebDriverFactory;
import UTILITIES.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC1 {
    @Test
    public void t1() {

        //String browserType= ConfigurationReader.get("browser");
        //System.out.println("browser type is " + browserType);
        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));

        // WebDriver driver=WebDriverFactory
    }

    @Test
    public void TC2() {

        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        driver.get(ConfigurationReader.get("urllazio"));
    }
}