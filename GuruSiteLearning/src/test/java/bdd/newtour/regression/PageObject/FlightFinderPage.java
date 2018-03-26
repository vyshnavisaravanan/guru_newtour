package bdd.newtour.regression.PageObject;

import bdd.newtour.regression.driver.DriverHelper;
import com.sun.jnlp.ApiDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FlightFinderPage extends DriverHelper {


    private void typefield(String tripType) {

        List<WebElement> triptypeelem = driver.findElements(By.cssSelector("input[name=tripType]"));

        for (WebElement ele : triptypeelem) {
            if (ele.getAttribute("value").equalsIgnoreCase(tripType)) {
                ele.click();
                break;
            } else if (ele.getAttribute("value").equalsIgnoreCase(tripType)) {
                ele.click();
                break;
            } else {
                System.out.println("InValid Trip Type!! Valid values are RoundTrip and OneWay" + ele.getText());
            }
        }
    }
    private void serviceClass(String serviceClassType) {

        List<WebElement> serviceClasstypeelem = driver.findElements(By.cssSelector("input[name=\"servClass\"]"));

        for (WebElement ele : serviceClasstypeelem) {
            if (ele.getAttribute("value").equalsIgnoreCase(serviceClassType)) {
                ele.click();
                break;
            } else if (ele.getAttribute("value").equalsIgnoreCase(serviceClassType)) {
                ele.click();
                break;
            }
            else if (ele.getAttribute("value").equalsIgnoreCase(serviceClassType)) {
                ele.click();
                break;
            }
            else {
                System.out.println("InValid Service Class!! Valid values are Coach, Business and First" + ele.getText());
            }
        }
    }
    private void dropDownList(String passenger,String departingFrom,String departingOnMonth,String departingOnDate,String ArrivingIn,String ReturnMonth,String ReturnDate, String airlinePref)
    {
        Select passdrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"passCount\"]")));
        passdrpvalue.selectByVisibleText(passenger);


        Select departingFromdrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"fromPort\"]")));
        departingFromdrpvalue.selectByVisibleText(departingFrom);

        Select departingOnMonthdrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"fromMonth\"]")));
        departingOnMonthdrpvalue.selectByVisibleText(departingOnMonth);

        Select departingOnDatedrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"fromDay\"]")));
        departingOnDatedrpvalue.selectByVisibleText(departingOnDate);

        Select ArrivingIndrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"toPort\"]")));
        ArrivingIndrpvalue.selectByVisibleText(ArrivingIn);

        Select ReturnMonthdrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"toMonth\"]")));
        ReturnMonthdrpvalue.selectByVisibleText(ReturnMonth);

        Select ReturnDatedrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"toDay\"]")));
        ReturnDatedrpvalue.selectByVisibleText(ReturnDate);

        Select airlinePrefdrpvalue=new Select(driver.findElement(By.cssSelector("select[name=\"airline\"]")));
        airlinePrefdrpvalue.selectByVisibleText(airlinePref);



    }

    public void searchFlight(String tripTyp,String passenger,String departingFrom,String departingOnMonth,String departingOnDate,String ArrivingIn,String ReturnMonth,String ReturnDate, String airlinePref,String serviceClass)
    {
        typefield(tripTyp);
        dropDownList(passenger,departingFrom,departingOnMonth,departingOnDate,ArrivingIn,ReturnMonth,ReturnDate,airlinePref);
        serviceClass(serviceClass);
        driver.findElement(By.cssSelector("input[name=\"findFlights\"]")).click();
    }

}
