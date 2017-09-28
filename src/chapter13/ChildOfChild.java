package chapter13;

public class ChildOfChild extends ChapterChild implements Cloneable{

    @Override
    protected ChildOfChild clone() throws CloneNotSupportedException {
        return (ChildOfChild) super.clone();
    }
}
