package chapter11.exercise02;

public class Student extends Person{
    private ClassStatus status;

    public Student(String name, String address, String phoneNumber, String eMailAddress, ClassStatus status) {
        super(name, address, phoneNumber, eMailAddress);
        this.status = status;
    }

    public enum ClassStatus {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR;
    }

    public ClassStatus getStatus() {
        return status;
    }
}
