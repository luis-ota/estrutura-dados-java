package Stack;

public abstract class ArrayStack<T> implements Stack<T> {
    int count = 0;
    T[] data;
    int initialSize;

    public ArrayStack() {

    }


    public T pop() {

        return this.data[--count];
    }

    public void clear() {
        this.data = (T[]) new Object[initialSize];
        this.count = 0;
    }



    public boolean isEmpty() {
        return this.count == 0;
    }


    public int len() {
        return this.count;
    }
}
