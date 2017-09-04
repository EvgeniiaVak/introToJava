package chapter11.exercise02;

public class Person {
    protected String
            name,
            address,
            phoneNumber,
            eMailAddress;

    public Person(String name, String address, String phoneNumber, String eMailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMailAddress = eMailAddress;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }
}
