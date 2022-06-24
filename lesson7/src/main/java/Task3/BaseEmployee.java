package Task3;

public abstract class BaseEmployee {
    protected String name;
    protected String lastname;
    protected int baseSalary = 3000;
    protected final int employmentYear;

    public BaseEmployee(String name, String lastname, int employmentYear) {
        this.name = name;
        this.lastname = lastname;
        this.employmentYear = employmentYear;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    protected int calculateMonthlySalary() {
        return baseSalary;
    }

    protected int getEmploymentLength() {
        int year = 2022;
        return year - employmentYear;
    }
}



