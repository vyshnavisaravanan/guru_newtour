package bdd.newtour.regression.PageObject;

import bdd.newtour.regression.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class BookAFlight extends DriverHelper {

    Random random=new Random();

   private void passengerSection(String passCount)
    {

        //Since passenger name fields depends on number of passenger, have stored locators in array
        String firstNamelocator[]= {"input[name=\"passFirst0\"]","input[name=\"passFirst1\"]","input[name=\"passFirst2\"]","input[name=\"passFirst3\"]"};
        String lastNameLocator[]={"input[name=\"passLast0\"]","input[name=\"passLast1\"]","input[name=\"passLast2\"]","input[name=\"passLast3\"]"};
        String mealPreference[]={"select[name=\"pass.0.meal\"]","select[name=\"pass.1.meal\"]","select[name=\"pass.2.meal\"]","select[name=\"pass.3.meal\"]"};

        for(int i=0;i<Integer.parseInt(passCount);i++) {
            driver.findElement(By.cssSelector(firstNamelocator[i])).sendKeys("FirstName"+i);
            driver.findElement(By.cssSelector(lastNameLocator[i])).sendKeys("LastName"+i);
            Select mealPrefdrop = new Select(driver.findElement(By.cssSelector(mealPreference[i])));
            mealPrefdrop.selectByIndex(random.nextInt(10));
        }

    }

    private void creditCardSection(String creditCardNumber,String ccFirstName,String ccMidName,String ccLastName)
    {
        Select creditCardDrpDwn = new Select(driver.findElement(By.cssSelector("select[name=\"creditCard\"]")));
        creditCardDrpDwn.selectByIndex(random.nextInt(6));
        driver.findElement(By.cssSelector("input[name=\"creditnumber\"]")).sendKeys(creditCardNumber);
        Select ccExpDtMonth = new Select(driver.findElement(By.cssSelector("select[name=\"cc_exp_dt_mn\"]")));
        ccExpDtMonth.selectByIndex(random.nextInt(12));
        Select ccExpDtYear = new Select(driver.findElement(By.cssSelector("select[name=\"cc_exp_dt_yr\"]")));
        ccExpDtYear.selectByIndex(random.nextInt(10));
        driver.findElement(By.cssSelector("input[name=\"cc_frst_name\"]")).sendKeys(ccFirstName);
        driver.findElement(By.cssSelector("input[name=\"cc_mid_name\"]")).sendKeys(ccMidName);
        driver.findElement(By.cssSelector("input[name=\"cc_last_name\"]")).sendKeys(ccLastName);

    }

    public void buyFlight(String passCount,String creditCardNumber,String ccFirstName,String ccMidName,String ccLastName)
    {
        passengerSection(passCount);
        creditCardSection(creditCardNumber,ccFirstName,ccMidName,ccLastName);
        driver.findElement(By.cssSelector("input[name=\"buyFlights\"]")).click();
    }


}
