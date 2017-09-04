package chapter11.exercise02;

public class Faculty extends Person{
    private int officeHours, rank;

    public Faculty(String name, String address, String phoneNumber, String eMailAddress, int officeHours, int rank) {
        super(name, address, phoneNumber, eMailAddress);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public int getRank() {
        return rank;
    }
}
