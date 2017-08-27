package chapter07;

public class CharactersInAString {
    public static void main(String[] args) {
        System.out.println(sort("cbavfasdksfa"));
    }

    public static String sort(String s) {
        char[] list = s.toCharArray();

        String output = "";
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    char temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
            output += list[i];
        }
        output += list[list.length - 1];

        return output;
    }
}
