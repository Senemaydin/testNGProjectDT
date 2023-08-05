package myapp.test.topic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Day14_Assertions {

    @Test
    public void hardAssertion(){
        /*
        HARD ASSERTION : if hard assertion fails, then STOP execution for that test case
         */

        System.out.println("line 10");
        assertTrue(true);
        System.out.println("line 15");
        assertEquals("apple", "orange"); //FAILS SO STOP
        System.out.println("line 18");
    }

    @Test
    public void softAssertion (){
          /*
        SOFT ASSERT : if soft assertion fails, then CONTINUE execution for that test case
         */

        System.out.println("line 23");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true); // PASS SO CONTINUE
        System.out.println("line 27");
        softAssert.assertEquals("apple", "orange"); // FAIL SO CONTINUE
        System.out.println("line 29");
        softAssert.assertAll("Test Assertion Completed"); //assertAll MUST BE FOR CORRECT TEST RESULT

    }
    @Test
    public void javaAssertion (){
        /*
        -Java assertions are hard assertions. If assert fails then STOPS
        We should not prefer to use TestNG assertions
         */
        System.out.println("line 41");
        assert 3<5; // if(...) assertion TRUE then continue otherwise throw java.lang.AssertionError
        System.out.println("line 37");
        assert "apple" == "apple";
        assert "apple".toLowerCase().contains("e");




    }

}
