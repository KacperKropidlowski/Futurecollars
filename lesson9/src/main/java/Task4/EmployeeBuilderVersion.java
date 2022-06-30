package Task4;

public class EmployeeBuilderVersion {

    private final String name;
    private final String surname;
    private final int age;
    private final double baseSalary;
    private final double bonus;
    public static final String WHITE_SPACE = " ";

    private EmployeeBuilderVersion(EmployeeBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.baseSalary = builder.baseSalary;
        this.bonus = builder.bonus;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    public double getTotalSalary() {
        return baseSalary + bonus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public static class EmployeeBuilder {

        private final String name;
        private final String surname;
        private int age;
        private double baseSalary;
        private double bonus;

        public EmployeeBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder baseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
            return this;
        }

        public EmployeeBuilder bonus(double bonus) {
            this.bonus = bonus;
            return this;
        }

        public EmployeeBuilderVersion build() {
            EmployeeBuilderVersion employeeBuilderVersion = new EmployeeBuilderVersion(this);
            return employeeBuilderVersion;
        }
    }
}