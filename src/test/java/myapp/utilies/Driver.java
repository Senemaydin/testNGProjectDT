package myapp.utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    //getDriver creates and instantiate the driver
    public static WebDriver getDriver(){
        if(driver==null){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();

        }
        return driver;

    }

    public static void closeDriver(){
      if (driver!=null){ //if driver is pointing any object such as chrome or edge, then quit
          driver.quit();
          driver=null;

      }

    }

}
