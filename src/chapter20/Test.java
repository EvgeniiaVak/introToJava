package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test implements Cloneable{
    private String example;

    public Test(String example) {
        this.example = example;
    }

    public static void main(String[] args) {
        List<Test> exampleList = Collections.nCopies(5, new Test("test"));
        System.out.println(exampleList);
        exampleList.get(0).setExample("after changed");
        System.out.println(exampleList);

        List<Test> secondExample = new ArrayList<>(Arrays.asList(null, null, null, null));
        Collections.fill(secondExample, new Test("after fill"));
        System.out.println(secondExample);
        secondExample.set(0, new Test("after set"));
        System.out.println(secondExample);
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "Test{" +
                "example='" + example + '\'' +
                '}';
    }
}
