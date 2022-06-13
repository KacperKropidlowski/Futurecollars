public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Jan", "Kowalski", 2020);
        System.out.println(manager1.calculateMonthlySalary());
        System.out.println(manager1.employmentLength());
        System.out.println(manager1.getBaseSalary());

        Ticketseller ticketseller1 = new Ticketseller("Jacek", "Placek", 1978);
        System.out.println(ticketseller1.calculateMonthlySalary());
        System.out.println(ticketseller1.employmentLength());
        System.out.println(ticketseller1.getBaseSalary());

        System.out.println(MinutesAndSeconds.minutesToSecond(999));
    }
}
