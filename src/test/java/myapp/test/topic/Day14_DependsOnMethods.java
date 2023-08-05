package myapp.test.topic;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Day14_DependsOnMethods {

    @Test
    public void homePage(){
        System.out.println("Home Page Test");
    }

    @Test
    public void searchTest(){
        System.out.println("Search Test");
        Assert.assertTrue(false); //FAILS
    }
    @Test(dependsOnMethods = "searchTest")  //searchTest PASS then checkOutTest executes
                                            //searchTest FAILS then checkOutTest will be IGNORED
    public void checkOutTest(){
        System.out.println("Checkout Test");
    }
}
