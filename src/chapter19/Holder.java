package chapter19;

public class Holder<T> {
    private T entity;

    public Holder() {
    }

    public Holder(T entity) {
        this.entity = entity;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "entity=" + entity +
                '}';
    }
}
