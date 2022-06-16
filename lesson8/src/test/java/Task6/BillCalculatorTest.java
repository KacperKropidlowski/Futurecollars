package Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculatorTest {
    @Test
    void shouldCalculateBillWithService(){
        //given
        double bill = 60;
        float service = 5;
        //when
        double result = BillCalculator.calculateBill(bill,service);
        //then
        Assertions.assertEquals(65,result);
    }
    @Test
    void shouldCalculateBillWithServiceAndDiscount(){
        //given
        double bill = 60;
        float service = 5;
        double discount = 0.25;
        //when
        double result = BillCalculator.calculateBill(bill,service,discount);
        //then
        Assertions.assertEquals(50,result);
    }
    @Test
    void shouldCalculateBillWithServiceAndTakeawayPackage(){
        //given
        double bill = 60;
        float service = 5;
        short takeawaypackage = 2;
        //when
        double result = BillCalculator.calculateBill(bill,service,takeawaypackage);
        //then
        Assertions.assertEquals(67,result);
    }

}