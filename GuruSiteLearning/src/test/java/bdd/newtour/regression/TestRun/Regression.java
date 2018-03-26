package bdd.newtour.regression.TestRun;

import bdd.newtour.regression.PageObject.*;
import bdd.newtour.regression.driver.DriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Regression extends DriverHelper {

    HomePage homepage = new HomePage();
    RegistrationPage registrationpage = new RegistrationPage();
    FlightFinderPage flightfinderpage=new FlightFinderPage();
    FlightSelect flightselect=new FlightSelect();
    BookAFlight bookaflight=new BookAFlight();
    FlightConfirmationPage flightconfirmpage = new FlightConfirmationPage();

    String userID="Vysh";
    String password="vysh";

    @Test
    public void endToEnd()
    {
       homepage.headerSection("REGISTER");
       registrationpage.Registrationform(userID,password);
       String confirmationMessage = registrationpage.RegistrationConfirmationPage();
       Assert.assertTrue(confirmationMessage.contains(userID));

       homepage.headerSection("Flights");
       flightfinderpage.searchFlight("OneWay","4","London","May","30","Paris","April","21","Unified Airlines","First");
       flightselect.FlightSelectContinue("Blue Skies Airlines$361","Blue Skies Airlines$631");
       bookaflight.buyFlight("2","CC22345SER","ccfirstname","ccMidname","ccLastName");
       String actlConfMes = flightconfirmpage.confirmationMessage();
        System.out.println("CC"+actlConfMes);

       Assert.assertTrue(actlConfMes.contains("booked!"));

       String actlConfNumber=flightconfirmpage.confirmationNumber();
       System.out.println("Flight Confirmation Number is:"+actlConfNumber);


    }
}
