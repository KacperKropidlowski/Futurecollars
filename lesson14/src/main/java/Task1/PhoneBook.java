package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Person person1 = new Person("Jacek Placek", "666666666");
        Person person2 = new Person("Barbara Kopara", "654321000", "Karmelkowa 1, Piaseczno");
        Person person3 = new Person("Radosław Radosny", "789987789", "Smętna 13, Pasikurowice");
        Person person4 = new Person("Emanuela Bobola", "555147963");
        Person person5 = new Person("Bartłomiej Goguś", "688688866", "Mazowiecka 15/2, Warszawa");
        Person person6 = new Person("Oktawia Felicjańska", "632598741");
        Person person7 = new Person("Ferdynand Wspaniały", "500600700", "Ładna 99, Boszkowo");
        Person person8 = new Person("Dobrochna Śmigiel-Migiel", "564645465");
        Person person9 = new Person("Bożydar Czartowski", "522347881", "Anielska 77, Diabelno");
        Person person10 = new Person("Mieczysław Topór", "788000166", "Walecznych 6, Malbork");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        List<Person> phoneBook = new ArrayList<>(people);

        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;
        System.out.println("Please enter name and surname of the person you are looking for:");
        String nameAndSurnameInput = scanner.nextLine();
        for (Person person : phoneBook) {
            if (person.getNameAndSurname().equals(nameAndSurnameInput)) {
                System.out.println(person);
                isFound = true;
            }
        }
        if (!isFound) {
            throw new RuntimeException("Person is not in phone book!");
        }
    }
}