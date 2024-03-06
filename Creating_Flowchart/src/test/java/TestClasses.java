import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClasses {
    EmployeeData employeeData = new EmployeeData();
    @Test
//    For salary greater than 5000
    public void TC1() {
        double salary = 6000;

        double result = employeeData.calculateEmployeeData(salary);

        Assert.assertEquals(result, 6120.0, "Incorrect remuneration for salary greater than 5000");
    }


    @Test
//    For salary equal to 5000
    public void TC2() {
        double salary = 5000;

        double result = employeeData.calculateEmployeeData(salary);

        Assert.assertEquals(result, 5000.0, "Incorrect remuneration for salary equal to 5000");
    }

    @Test
//    For salary less than 5000
    public void TC3() {
        double salary = 4500;

        double result = employeeData.calculateEmployeeData(salary);

        Assert.assertEquals(result, 4500.0, "Incorrect remuneration for salary less than 5000");
    }

    @Test
//    For negative salary
    public void TC4() {
        double salary = -1000;

        double result = employeeData.calculateEmployeeData(salary);

        Assert.assertEquals(result, 0.0, "Incorrect remuneration for negative salary");
    }

    @Test
//    For salary close to 5000
    public void TC5() {
        double salary = 4999;

        double result = employeeData.calculateEmployeeData(salary);

        Assert.assertEquals(result, 4999, "Incorrect remuneration for salary close to 5000");
    }
}
