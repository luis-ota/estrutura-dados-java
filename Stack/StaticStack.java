package Stack;

import java.util.EmptyStackException;

public class StaticStack<T> extends ArrayStack<T> {

    public StaticStack(int size) {
        initialSize = size;
        data = (T[]) new Object[initialSize];
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowError("Ta cheiooo!!!");
        }
        data[count++] = item;

    }
}
