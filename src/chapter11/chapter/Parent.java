package chapter11.chapter;

public class Parent {
    public Parent() {
        System.out.println("parent");
    }

    public Parent(String some) {
        System.out.println("Parent constructor with some");
    }

    protected void methodToOverride() {
        System.out.println("methodToOverride");
    }

    public int compareTo(Object o) {
        return -1;
    }
}
