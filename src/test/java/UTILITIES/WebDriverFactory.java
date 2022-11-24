package UTILITIES;

public class broswer {
    WebDriver driver=null;
    switch (browserType.toLowerCase()){
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            break;

        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            break;

    }
    return driver;
}
