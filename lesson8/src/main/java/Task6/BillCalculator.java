package Task6;

public class BillCalculator {
    public static double calculateBill(double bill,float service){
        return bill + service;
    }
    public static double calculateBill(double bill,float service,double discount){
        return bill - bill * discount + service;
    }
    public static double calculateBill(double bill,float service, short takeawayPackage){
        return bill + service + takeawayPackage;
    }

}
