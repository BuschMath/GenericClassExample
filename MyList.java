public class MyList<T> {
    private T[] array;

    public MyList(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T element) {
        array[index] = element;
    }

    public T get(int index) {
        return array[index];
    }
}
