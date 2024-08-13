public abstract class ArrayStack <T> implements Stack<T>{
    private int count = 0;
    private T[] data;
    private int initialSize;
    public ArrayStack(int initialSize) {
        this.initialSize = initialSize;
        this.data = (T[]) new Object[initialSize];
    }

    public void push(T item) {
        if (count == data.length) {
            resize(2 * data.length);
        }
        this.data[count++] = item;
    }

    public T pop() {
        return this.data[count--];
    }

    public void clear() {
        this.data = (T[]) new Object[initialSize];
        this.count = 0;
    }

    private void resize(int newSize) {
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
