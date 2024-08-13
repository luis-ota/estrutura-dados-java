package Stack;

public interface Stack<T> {
    public void push(T item);
    public T pop();
    public void clear();
    public int len();
    public boolean isEmpty();
    public boolean isFull();




}
