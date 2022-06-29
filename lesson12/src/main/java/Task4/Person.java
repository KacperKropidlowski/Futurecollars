package Task4;

public class Person implements Comparable<Person> {
    private final String name;
    private final String surname;
    private final int birthYear;
    private int height;
    private double weight;

    public Person(String name, String surname, int birthYear, int height, double weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(2022 - this.birthYear, 2022 - o.birthYear);
    }
}
