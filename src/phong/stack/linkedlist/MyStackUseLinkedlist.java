package phong.stack.linkedlist;
import java.util.*;

public class MyStackUseLinkedlist<E> {
    private LinkedList<E> e;
    private int size = 0;

    public MyStackUseLinkedlist() {
        this.e = new LinkedList<>();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return false;
    }

    public void push(E o) {
        e.addLast(o);
        size++;
    }

    public E pop() {
        if(!isEmpty()) {
            E temp = e.getLast();
            e.removeLast();
            size--;
            return temp;
        }
        else {
            return null;
        }
    }

    public E peek() {
        if (!isEmpty()) {
            return e.getLast();
        }
        else {
            return null;
        }
    }

    public int size() {
        return size;
    }

    public String toString() {
        return e.toString();
    }
}
