package chapter11.chapter;

public class Child extends Parent implements Comparable{
    //abstract String some;

    public Child() {
        super();
        System.out.println("child");
    }

    public Child(String some) {
        super(some);
        System.out.println(some);
    }

    @Override
    public void methodToOverride() {
        //super();
        System.out.println("methodToOverride in child");
        //return null;
    }

    public void anotherMethod() {
        super.methodToOverride();
        System.out.println("anotherMethod");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Child o) {
        return super.equals(o);
    }
}
