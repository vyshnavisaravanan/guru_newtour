package bdd.newtour.regression.driver;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DriverHelper {

    public static WebDriver driver;

    @BeforeClass
    public void openwebsite()
    {

        driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();

    }


//    @AfterClass
    public void closewebsite()
    {
        driver.quit();
    }



}
