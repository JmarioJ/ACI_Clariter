package TestCase;

import Hooks.TestBase;
import UTILITIES.ConfigurationReader;
import UTILITIES.Driver;
import org.testng.annotations.Test;

public class TC2 extends TestBase {

    @Test
    public void sample(){
        driver.get(ConfigurationReader.get("urllazio"));   // invece di url ma inserita una variabile
    }
    //esecuzione test
    //termine test
    //il test ricomincia con url caso

    @Test
    public void sample1(){
        driver.get(ConfigurationReader.get("urlcaso"));
    }

}
