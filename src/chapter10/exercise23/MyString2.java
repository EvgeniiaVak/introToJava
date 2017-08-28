package chapter10.exercise23;

public class MyString2 {
    private String myString;

    public MyString2(String s) {
        myString = s;
    }

    public int compare(MyString2 s){
        char[] original = toChars();
        char[] compared = s.toChars();

        if (original.length > compared.length)
            return compared.length;
        else if (original.length < compared.length)
            return - original.length;

        for (int i = 0; i < original.length; i++) {
            if (original[i] > compared[i])
                return i + 1;
            else if (original[i] < compared[i])
                return - i - 1;
        }

        return 0;
    }

    public MyString2 substring(int begin){
        return new MyString2(myString.substring(begin));
    }

    public MyString2 toUpperCase(){
        return new MyString2(myString.toUpperCase());
    }

    public char[] toChars(){
        char[] result = new char[myString.length()];

        for (int i = 0; i < result.length; i++) {
            result[i] = myString.charAt(i);
        }

        return result;
    }

    public static MyString2 valueOf(boolean b){
        String result = (b) ? "true" : "false";
        return new MyString2(result);
    }
}
