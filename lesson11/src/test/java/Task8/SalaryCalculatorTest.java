package Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SalaryCalculatorTest {
    @Test
    void shouldCalculateSalary() {
        //given
        BaseSalaryProvider baseSalaryProvider = Mockito.mock(BaseSalaryProvider.class);
        SaturdayBonusProvider saturdayBonusProvider = Mockito.mock(SaturdayBonusProvider.class);
        Mockito.when(baseSalaryProvider.getBaseSalary()).thenReturn(5000.0);
        Mockito.when(saturdayBonusProvider.getSaturdayBonus()).thenReturn(500.0);
        //when
        double actual = new SalaryCalculator(baseSalaryProvider, saturdayBonusProvider).calculateSalary(500, 4);
        //then
        Assertions.assertEquals(7500.0, actual);
    }

}