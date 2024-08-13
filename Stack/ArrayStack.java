package Stack;

public abstract class ArrayStack <T> implements Stack<T>{
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

    void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        System.arraycopy(data, 0, newArray, 0, count);
        data = newArray;
    }

    public boolean isEmpty() {
        return this.count==0;
    }

    public boolean isFull() {
        return this.count == initialSize;
    }

    public int len(){
        return this.count;
    }
}
