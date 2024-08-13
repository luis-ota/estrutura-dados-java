package Stack;

public class StaticStack<T> extends ArrayStack<T> {

    public StaticStack(int size) {
        initialSize = size;
        data = (T[]) new Object[initialSize];
    }

    public boolean isFull() {
        return this.count == initialSize;
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowError("Ta cheiooo!!!");
        }
        data[count++] = item;

    }
}
