package Task4;

public class Employee {

    private final String name;
    private final String surname;
    private int age;
    private double baseSalary;
    private double bonus;
    public static final String whitespace = " ";


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, double baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;

    }

    public Employee(String name, String surname, int age, double baseSalary, double bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + whitespace + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + whitespace + surname + " is " + age;
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