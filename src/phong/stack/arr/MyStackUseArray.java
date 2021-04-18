package phong.stack.arr;
import java.lang.reflect.Array;
import java.util.*;

public class MyStackUseArray<E> {
    private int size = 0;
    private E[] e;

    public MyStackUseArray() {
        this.e = (E[]) new Object[10];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= e.length;
    }

    public void push(E o) {
        if (isFull()) {
            e = Arrays.copyOf(e, e.length*2);
        }
        e[size] = o;
        size++;
    }

    public E pop() {
        if (!isEmpty()) {
            size--;
            E temp = e[size];
            e[size] = null;
            return temp;
        }
        else {
            return null;
        }
    }

    public E peek() {
        if (!isEmpty()) {
            return e[size - 1];
        }
        else {
            return null;
        }
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
