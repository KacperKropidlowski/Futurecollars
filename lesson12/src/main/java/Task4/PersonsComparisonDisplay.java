package Task4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonsComparisonDisplay {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Jacek", "Placek", 1999, 180, 81.1));
        persons.add(new Person("Janek", "Dzbanek", 1997, 178, 76.5));
        persons.add(new Person("Anka", "Szklanka", 1996, 168, 62.3));
        persons.add(new Person("Barbara", "Kopara", 1989, 155, 78.7));
        persons.add(new Person("Rafał", "Koń", 1993, 188, 90.4));
        persons.add(new Person("Beata", "Łopata", 1977, 165, 55.5));

        Set<Person> personsByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        personsByHeight.addAll(persons);

        Set<Person> personsByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getWeight() < o2.getWeight()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        personsByWeight.addAll(persons);

        System.out.println("Persons from lowest to highest:");
        for (Person person : personsByHeight) {
            System.out.println(person.getName());
        }
        System.out.println("");

        System.out.println("Persons from heaviest to lightest:");
        for (Person person : personsByWeight) {
            System.out.println(person.getName());
        }
        System.out.println("");

        System.out.println("Default set\nPersons from youngest to oldest:");
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}
