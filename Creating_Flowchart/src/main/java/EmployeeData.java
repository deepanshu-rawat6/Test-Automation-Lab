
public class EmployeeData {
    public double calculateEmployeeData(double sal_amt) {
        double renumeration = 0, comission = 0;
        if (sal_amt < 0) {
            return 0.0;
        }
        if (sal_amt > 5000) {
            comission = ((sal_amt - 5000) * 0.12);
        } else  {
            comission = 0;
        }
        renumeration = sal_amt + comission;
        return renumeration;
    }
}
