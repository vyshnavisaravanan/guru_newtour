package bdd.newtour.regression.PageObject;

import bdd.newtour.regression.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlightSelect extends DriverHelper {

    private void selectDepartFlight(String flightname) {
        List<WebElement> selDepFlight = driver.findElements(By.cssSelector(".frame_action_xrows>input[name=\"outFlight\"]"));

        for (WebElement ele : selDepFlight) {
            System.out.println(ele.getAttribute("value"));
            if (ele.getAttribute("value").contains(flightname)) {
                ele.click();
                break;
            } else if (ele.getAttribute("value").contains(flightname)) {
                ele.click();
                System.out.println("A iam here");

                break;
            } else if (ele.getAttribute("value").contains(flightname)) {
                ele.click();

                break;
            } else if (ele.getAttribute("value").contains(flightname)) {
                ele.click();

                break;
            }


        }

    }

    private void selectReturnFlight(String returnFlightName) {
        List<WebElement> selDepFlight = driver.findElements(By.cssSelector(".frame_action_xrows>input[name=\"inFlight\"]"));

        for (WebElement ele : selDepFlight) {
            System.out.println(ele.getAttribute("value"));
            if (ele.getAttribute("value").contains(returnFlightName)) {
                ele.click();
                break;
            } else if (ele.getAttribute("value").contains(returnFlightName)) {
                ele.click();
                System.out.println("A iam here");

                break;
            } else if (ele.getAttribute("value").contains(returnFlightName)) {
                ele.click();

                break;
            } else if (ele.getAttribute("value").contains(returnFlightName)) {
                ele.click();

                break;
            }


        }


    }

    public void FlightSelectContinue(String flightname,String returnFlightName) {
        selectDepartFlight(flightname);
        selectReturnFlight(returnFlightName);
        driver.findElement(By.cssSelector("input[name=\"reserveFlights\"]")).click();

    }
}
