package chapter21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = Collections.unmodifiableList(Arrays.asList("Chicago", "Boston"));
        list.remove("Dallas");
    }
}
