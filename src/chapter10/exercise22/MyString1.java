package chapter10.exercise22;


public class MyString1 {
    char[] chars;

    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[] {'a', 'b', 'c'});
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.equals(new MyString1(new char[] {'a', 'b', 'c'})));

        MyString1 s2 = s.substring(1);
        System.out.println(s2.chars);

        MyString1 capitals = new MyString1(new char[]{'A', 'B', 'C'});
        System.out.println(capitals.chars);
        MyString1 lower = capitals.toLowerCase();
        System.out.println(lower.chars);

        MyString1 number = valueOf(-345);
        System.out.println(number.chars);

    }

    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index){
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    public MyString1 substring(int begin){
        return substring(begin, length());
    }

    public MyString1 substring(int begin, int end){
        int length = end - begin;
        char[] result = new char[length];
        System.arraycopy(chars, begin, result, 0, length);
        return new MyString1(result);
    }

    public MyString1 toLowerCase(){
        int length = chars.length;
        char[] result = new char[length];

        for (int i = 0; i < length; i++) {
            result[i] = Character.toLowerCase(chars[i]);
        }

        return new MyString1(result);
    }

    public boolean equals(MyString1 s){
        if (length() != s.length())
            return false;

        for (int i = 0; i < length(); i++) {
            if (chars[i] != s.chars[i])
                return false;
        }

        return true;
    }
    
    public static MyString1 valueOf(int i){
        //count how many digits
        int number = Math.abs(i);
        int length = 0;
        while (number > 0) {
            length++;
            number /= 10;
        }

        //if the number is negative we'll need one more place to hold -
        if (i < 0)
            length++;
        
        //create chars[] that will be of needed size
        char[] result = new char[length];
        
        //if the number was negative start new array with - 
        int index = 0;
        if (i < 0) {
            result[0] = '-';
            index++;
        }
        i = Math.abs(i);
        
        //fill in the digits
        for (int j = length - 1; j >= index; j--) {
            int digit = i % 10;
            result[j] = (char) ('0' + digit);
            i /= 10;
        }
        
        return new MyString1(result);
    }
}
