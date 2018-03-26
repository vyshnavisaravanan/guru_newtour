package bdd.newtour.regression.PageObject;

import bdd.newtour.regression.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends DriverHelper {

    public void headerSection(String headerName)
    {
        List<WebElement> headernamelist = driver.findElements(By.cssSelector(".mouseOut"));

        for(WebElement element:headernamelist)
        {
            if(element.getText().equalsIgnoreCase(headerName))
            {
                element.click();
                break;
            }
        }
    }


}
