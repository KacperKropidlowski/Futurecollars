package Task6;

public class BillCalculator {
    public static double calculateBill(double foodCost, float serviceCost) {
        return foodCost + serviceCost;
    }

    public static double calculateBill(double foodCost, float serviceCost, double discount) {
        return foodCost - foodCost * discount + serviceCost;
    }

    public static double calculateBill(double foodCost, float serviceCost, short takeawayPackageCost) {
        return foodCost + serviceCost + takeawayPackageCost;
    }

}
