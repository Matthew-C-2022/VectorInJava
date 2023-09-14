package Vector;

public class Vector<T> {
    private int size_t;
    private int capacity;

    private Object[] data;
    public Vector()
    {
        size_t = 1;
        capacity = 1;
        this.data = new Object[capacity]; // Initialize the array

    }
    private void resize() {
        capacity *= 2;
        Object[] newData = new Object[capacity];
        System.arraycopy(data, 0, newData, 0, size_t);
        data = newData;
    }
    public void resize(int Newsize) {
        capacity = Newsize;
        size_t = Newsize;
        Object[] newData = new Object[Newsize + 1];
        System.arraycopy(data, 0, newData, 0, Newsize + 1);
        data = newData;
    }

    public void push_back(T element) {
        if (size_t == capacity) {
            resize();
        }
        data[size_t++] = element;
    }

    public void pop_back() {
        if (size_t > 0) {
            data[--size_t] = null;
        }
    }


    public T at(int index) {
        if (index >= size_t || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) data[index];
    }

    // Get size
    public int size() {
        return size_t;
    }

    // Get capacity
    public int capacity() {
        return capacity;
    }


}
