public class TransportationCost {
    public double computeCost(double weight) {
        double chargeFor40Kg = 5.75;
        if (weight <= 0.0) {
            return 0.0;
        }
        if (weight <= 40.0) {
            return chargeFor40Kg;
        } else if (weight <= 500.0) {
            double tempWt = weight - 40.0;
            return chargeFor40Kg + Math.ceil(tempWt / 18) * 3.8;
        } else {
            return chargeFor40Kg + 26 * 3.8 + (weight - 500) * 0.67;
        }
    }
}
