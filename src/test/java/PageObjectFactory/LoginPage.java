package PageObjectFactory;

import UTILITIES.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'ACCEDI')]")
    WebElement Accedi;

    @FindBy(xpath="//input[@id=\"username\"]")
    WebElement username;

    @FindBy (xpath="//input[@id=\"password\"]")
    WebElement password;

    @FindBy (xpath="//input[@id=\"kc-login\"]")
    WebElement loginBtn;

    public void logintomainpage() throws InterruptedException {
        Thread.sleep(2000);
        Accedi.click();
        Thread.sleep(2000);
        username.sendKeys("g.miranda");
        Thread.sleep(2000);
        password.sendKeys("iniziale");
        Thread.sleep(2000);
        loginBtn.click();


    }
}

