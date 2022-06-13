public abstract class BaseEmployee {
    protected String name;
    protected String lastname;
    protected int baseSalary = 3000;
    public int bonusSalary;
    protected int employmentYear;

    public BaseEmployee(String name, String lastname, int employmentYear) {
        this.name = name;
        this.lastname = lastname;
        this.employmentYear = employmentYear;
    }

    public BaseEmployee(String name, String lastname, int employmentYear, int bonusSalary) {
        this.name = name;
        this.lastname = lastname;
        this.employmentYear = employmentYear;
        this.bonusSalary = bonusSalary;
    }

    protected int calculateMonthlySalary() {
        return baseSalary + bonusSalary;
    }

    protected int employmentLength() {
        int year = 2022;
        return year - employmentYear;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}



