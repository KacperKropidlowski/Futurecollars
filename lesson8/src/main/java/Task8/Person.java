package Task8;

import java.util.Objects;

public class Person {
    private final String name;
    private final String lastname;
    private final double height;
    private final double weight;
    private final int age;
    private final String hairColour;
    private final String eyeColour;

    public Person(String name, String lastname, double height, double weight, int age, String hairColour, String eyeColour) {
        this.name = name;
        this.lastname = lastname;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && age == person.age && name.equals(person.name) && lastname.equals(person.lastname) && hairColour.equals(person.hairColour) && eyeColour.equals(person.eyeColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, height, weight, age, hairColour, eyeColour);
    }
}
