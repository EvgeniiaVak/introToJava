package chapter10.exercise28;

public class MyStringBuilder2 {
    private String s;

    public MyStringBuilder2() {
        s = "";
    }

    public MyStringBuilder2(char[] chars){
        s = new String(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String result = this.s.substring(0, offset) + s.s + this.s.substring(offset);

        return new MyStringBuilder2(result);
    }

    public MyStringBuilder2 reverse() {
        char[] chars = s.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) {
            int reverseIndex = length - 1 - i;

            char temp = chars[i];
            chars[i] = chars[reverseIndex];
            chars[reverseIndex] = temp;
        }

        return new MyStringBuilder2(chars);
    }

    public MyStringBuilder2 substring(int begin){
        return new MyStringBuilder2(s.substring(begin));
    }

    public MyStringBuilder2 toUpperCase() {
        return new MyStringBuilder2(s.toUpperCase());
    }

    @Override
    public String toString() {
        return s;
    }
}
