package chapter19;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList superStrings = new ArrayList();
        superStrings.add("some");
        superStrings.add(new Object());
        print(superStrings);
        printWithWildCards(superStrings);

        ArrayList withNumbers = new ArrayList();
        withNumbers.add("other");
        Object object = new Integer(1);
        Integer integerObject = new Integer(2);
        Object objec2 = new String("some third");
        withNumbers.add(object);
        withNumbers.add(objec2);
        print(withNumbers);
        printWithWildCards(withNumbers);
    }

    private static void wildcardMethod(ArrayList<?> some) {

    }


    private static <T extends String> void print(List<T> superStringList) {
        System.out.println(superStringList);
    }

    private static void printWithWildCards(List<? super String> superStringList) {
        System.out.println(superStringList);
    }

    public static <T> void staticGenericMessage(T someObject) {
        System.out.println(someObject);
    }
}
