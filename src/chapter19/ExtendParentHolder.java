package chapter19;

public class ExtendParentHolder<T extends Parent> extends Holder<T> {
    public ExtendParentHolder() {
    }

    public ExtendParentHolder(T entity) {
        super(entity);
    }

    @Override
    public String toString() {
        return "ExtendParentHolder{" + super.toString() + '}';
    }
}
