package Stack;

public class DynamicStack<T> extends ArrayStack<T> {

    public DynamicStack() {
        initialSize = 5;
        data = (T[]) new Object[initialSize];
    }

    void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        System.arraycopy(data, 0, newArray, 0, count);
        data = newArray;
    }
    @Override
    public void push(T item) {
        if (count == initialSize) {
            resize(2 * data.length);
        }
        data[count++] = item;

    }
}
