public class Manager extends BaseEmployee {
    public Manager(String name, String lastname, int yearOfJoining) {
        super(name, lastname, yearOfJoining);
        baseSalary = 5000;
        bonusSalary = 500;
    }

    public Manager(String name, String lastname, int yearOfJoining, int bonusSalary) {
        super(name, lastname, yearOfJoining, bonusSalary);
        baseSalary = 5000;
    }
}
