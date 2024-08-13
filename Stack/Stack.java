package Stack;

public interface Stack<T> {
    void push(T item);

    T pop();

    void clear();

    int len();

    boolean isEmpty();


}
