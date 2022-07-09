package Task4;

import java.util.*;

public class PersonsComparisonDisplay {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Jacek", "Placek", 1999, 180, 81.1));
        persons.add(new Person("Janek", "Dzbanek", 1997, 178, 76.5));
        persons.add(new Person("Anka", "Szklanka", 1996, 168, 62.3));
        persons.add(new Person("Barbara", "Kopara", 1989, 155, 78.7));
        persons.add(new Person("Rafał", "Koń", 1993, 188, 90.4));
        persons.add(new Person("Beata", "Łopata", 1977, 165, 55.5));

        System.out.println("Default set\nPersons from youngest to oldest:");
        for (Person person : persons) {
            System.out.println(person.getName());
        }
        System.out.println("");

        persons.sort(Comparator.comparingInt(Person::getHeight));
        System.out.println("Persons from lowest to highest:");
        for (Person person : persons) {
            System.out.println(person.getName());
        }
        System.out.println("");

        persons.sort(Comparator.comparingDouble(Person::getWeight));
        Collections.reverse(persons);

        System.out.println("Persons from heaviest to lightest:");
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}
