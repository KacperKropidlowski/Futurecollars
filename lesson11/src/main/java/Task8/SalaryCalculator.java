package Task8;

public class SalaryCalculator {

    private BaseSalaryProvider baseSalaryProvider;
    private SaturdayBonusProvider saturdayBonusProvider;

    SalaryCalculator(BaseSalaryProvider baseSalaryProvider, SaturdayBonusProvider saturdayBonusProvider) {
        this.baseSalaryProvider = baseSalaryProvider;
        this.saturdayBonusProvider = saturdayBonusProvider;
    }

    public double calculateSalary(double bonus, double workedSaturdays) {
        return this.baseSalaryProvider.getBaseSalary() + bonus + workedSaturdays * this.saturdayBonusProvider.getSaturdayBonus();
    }
}
