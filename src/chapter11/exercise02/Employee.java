package chapter11.exercise02;

import chapter10.exercise14.MyDate;

public class Employee extends Person{
    private int office, salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String eMailAddress, int office, int salary) {
        super(name, address, phoneNumber, eMailAddress);
        this.office = office;
        this.salary = salary;
        dateHired = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }
}
