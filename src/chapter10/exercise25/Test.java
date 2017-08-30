package chapter10.exercise25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] check = split("Some regex some more regex and regex other", "regex");
        System.out.println(Arrays.toString(check));

        String[] without = split("Some regex some more regex and regex other", "without");
        System.out.println(Arrays.toString(without));

        String[] corners = split("regex Some regex some more regex and regex other regex", "regex");
        System.out.println(Arrays.toString(corners));
    }

    public static String[] split(String s, String regex) {
        StringBuilder stringBuilder = new StringBuilder(s);
        List<String> result = new ArrayList<>();

        while (stringBuilder.indexOf(regex) >= 0) {
            int index = stringBuilder.indexOf(regex);
            String firstHalf = stringBuilder.substring(0, index);
            String secondHalf = stringBuilder.substring(index + regex.length(), stringBuilder.length());

            if (index != 0)
                result.add(firstHalf);

            result.add(regex);

            stringBuilder = new StringBuilder(secondHalf);
        }
        if (stringBuilder.length() != 0)
            result.add(stringBuilder.toString());

        return result.toArray(new String[result.size()]);
    }
}
