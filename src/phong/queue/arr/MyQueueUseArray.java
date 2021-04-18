package phong.queue.arr;
import java.util.*;

public class MyQueueUseArray<E> {
    private int size = 0;
    private E[] e;

    public MyQueueUseArray() {
        this.e = (E[]) new Object[10];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= e.length;
    }

    public void enqueue(E o) {
        if (isFull()) {
            e = Arrays.copyOf(e, e.length*2);
        }
        e[size] = o;
        size++;
    }

    public E dequeue() {
        if (!isEmpty()) {
            E temp = e[0];
            for (int i = 0; i < size-1; i++) {
                e[i] = e[i+1];
            }
            e[size-1] = null;
            size--;
            return temp;
        }
        else {
            return null;
        }
    }

    public E peek() {
        return e[0];
    }

    public int size() {
        return size;
    }

    public String toString() {
        String print = "";
        for (int i = 0; i < size; i++) {
            if (i == size -1) {
                print += e[i];
            }
            else {
                print += (e[i] + ",");
            }
        }
        return print;
    }
}
