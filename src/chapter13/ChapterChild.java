package chapter13;

public class ChapterChild extends Chapter implements Cloneable{
    @Override
    public String returnObject() {
        return new String();
    }

    @Override
    protected ChapterChild clone() throws CloneNotSupportedException {
        return (ChapterChild) super.clone();
    }
}
