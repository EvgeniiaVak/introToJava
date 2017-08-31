package chapter10.exercise27;

public class MyStringBuilder1 {
    private String s;
    public MyStringBuilder1(String s)  {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){
        return  new MyStringBuilder1( this.s + s.s);
    }

    public MyStringBuilder1 append(int i){
        return new MyStringBuilder1(s + i);
    }

    public int length(){
        return s.length();
    }

    public char charAt(int index){
        return s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase(){
        return new MyStringBuilder1(s.toLowerCase());
    }

    public MyStringBuilder1 substring(int begin, int end){
        return new MyStringBuilder1(s.substring(begin, end));
    }

    public String toString(){
        return s;
    }
}
