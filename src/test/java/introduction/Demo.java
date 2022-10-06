package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class Demo {

    //4 yra lyginis skaicius


    @Test
    public void testNumber4IsEven() {
        //duomenys
        int actualImput = 4;
        int actualResults;
        int expectedResult = 0;


        //testo veiksmas

        actualResults = actualImput % 2;

        //palyginimas

        Assert.assertEquals(actualResults, expectedResult);
    }

    @Test
    public void testNumber5IsEven() {
        //duomenys
        int actualImput = 5;
        int actualResults;
        int expectedResult = 1;


        //testo veiksmas

        actualResults = actualImput % 2;

        //palyginimas

        Assert.assertTrue(actualResults == expectedResult,
                "Actual: " + actualResults + ", expected:" + expectedResult);
    }

    //Dabar nera 19 valandu

    @Test
    public void testIfTimeNowIsNot19Hour() {
        //Duomenys
        int notExpectedTime = 19;
        int actualTime;
        boolean isSameTime;

        //Teso veiksmas

        actualTime = LocalTime.now().getHour();
        isSameTime = notExpectedTime == actualTime;

        //palyginimas

        Assert.assertFalse(isSameTime,
                String.format("Expected: %s, Acutal: %s", notExpectedTime, actualTime));


    }