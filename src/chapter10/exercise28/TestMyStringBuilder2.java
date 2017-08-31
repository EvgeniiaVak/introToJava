package chapter10.exercise28;

public class TestMyStringBuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2("example 1");
        MyStringBuilder2 show = myStringBuilder2.insert(3, new MyStringBuilder2("SOME"));
        System.out.println(show);

        show = myStringBuilder2.insert(0,new MyStringBuilder2("SOME"));
        System.out.println(show);

        show = myStringBuilder2.insert(9,new MyStringBuilder2("SOME"));
        System.out.println(show);

        show = myStringBuilder2.reverse();
        System.out.println(show);
    }
}
