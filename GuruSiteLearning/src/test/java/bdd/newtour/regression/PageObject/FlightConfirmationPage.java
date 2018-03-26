package bdd.newtour.regression.PageObject;

import bdd.newtour.regression.driver.DriverHelper;
import org.openqa.selenium.By;

public class FlightConfirmationPage extends DriverHelper {


    public String confirmationMessage()
    {
        String actConfMess = driver.findElement(By.cssSelector("font[size=\"+1\"]")).getText();
        return actConfMess;
    }

    public String confirmationNumber()
    {
        String actConfNumb = driver.findElement(By.cssSelector(".frame_header_info>table>tbody>tr>td>b>font>font>b>font")).getText();
        return actConfNumb;

    }


}
