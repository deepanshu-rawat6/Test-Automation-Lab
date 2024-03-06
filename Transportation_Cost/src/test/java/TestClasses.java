import org.testng.Assert;
import org.testng.annotations.*;

public class TestClasses {

    TransportationCost transportationCost = new TransportationCost();

    @Test
    public void TC1() {
        double weight = 0.0;

        double result = transportationCost.computeCost(weight);

        Assert.assertEquals(result, 0.0, "Incorrect cost for weight less than or equal to zero");
    }

    @Test
    public void TC2() {
        double weight = 30.0;

        double result = transportationCost.computeCost(weight);

        Assert.assertEquals(result, 5.75, "Incorrect cost for weight less than or equal to 40");
    }

    @Test
    public void TC3() {
        double weight = 250.0;

        double result = transportationCost.computeCost(weight);

        Assert.assertEquals(result, 51.349999999999994, "Incorrect cost for weight less than or equal to 500");
    }

    @Test
    public void TC4() {
        double weight = 499.0;

        double result = transportationCost.computeCost(weight);

        Assert.assertEquals(result, 104.55, "Incorrect cost for weight less than or equal to 500");
    }

    @Test
    public void TC5() {
        double weight = 510.0;

        double result = transportationCost.computeCost(weight);

        Assert.assertEquals(result, 111.25, "Incorrect cost for weight greater than 500");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("In before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("In after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("In before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("In after class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("In before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("In after test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("In before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("In after suite");
    }
}
