import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransportationCost obj = new TransportationCost();
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        System.out.println(obj.computeCost(weight));
    }
}
