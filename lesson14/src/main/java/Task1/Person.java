package Task1;

public class Person {
    private final String nameAndSurname;
    private final String phoneNumber;
    private String address;

    public Person(String nameAndSurname, String phoneNumber, String address) {
        this(nameAndSurname,phoneNumber);
        this.address = address;
    }

    public Person(String nameAndSurname, String phoneNumber) {
        this.nameAndSurname = nameAndSurname;
        this.phoneNumber = phoneNumber;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
