package Task4;

public class Employee {
    private static final String WHITE_SPACE = " ";
    private final String name;
    private final String surname;
    private int age;
    private double baseSalary;
    private double bonus;

    public Employee(String name, String surname, int age, double baseSalary, double bonus) {
        this(name, surname, age, baseSalary);
        this.bonus = bonus;
    }

    public Employee(String name, String surname, int age, double baseSalary) {
        this(name, surname, age);
        this.baseSalary = baseSalary;

    }

    public Employee(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

}