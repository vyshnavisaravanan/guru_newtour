package bdd.newtour.regression.PageObject;

import bdd.newtour.regression.driver.DriverHelper;
import org.openqa.selenium.By;


public class RegistrationPage extends DriverHelper {

    public void Registrationform(String userid, String password)
    {
        driver.findElement(By.cssSelector("#email")).sendKeys(userid);
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys(password);
        driver.findElement(By.cssSelector("input[name=\"confirmPassword\"]")).sendKeys(password);
        driver.findElement(By.cssSelector("input[name=\"register\"]")).click();

    }
    public String RegistrationConfirmationPage()
    {
        String confMessage = driver.findElement(By.cssSelector("html>body>div>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr>td>p>a>font>b")).getText();
        return confMessage;
    }
}
