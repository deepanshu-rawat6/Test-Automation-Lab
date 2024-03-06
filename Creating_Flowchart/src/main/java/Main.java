import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeData obj = new EmployeeData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fixed salary from the company: ");
        double sal_amt = sc.nextDouble();
        System.out.println(obj.calculateEmployeeData(sal_amt));
    }
}
