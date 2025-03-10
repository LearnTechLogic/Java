package demo3genericity;

public interface Data<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
    T query(T t);
}
