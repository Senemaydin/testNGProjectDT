package myapp.test.topic;

import myapp.utilies.Driver;
import org.testng.annotations.Test;

public class Day14_DriverTest {
    @Test
    public void driverTest(){
//    driver.get("https://amazon.com");
//    driver --->Driver.getDriver
    Driver.getDriver().get("https://amazon.com");
        String amazonTitle = Driver.getDriver().getTitle();
        String amazonURL = Driver.getDriver().getCurrentUrl();
        System.out.println("amazonTitle = " + amazonTitle);
        System.out.println("amazonURL = " + amazonURL);
        Driver.closeDriver();
    }

}
