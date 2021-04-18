package phong.queue.linkedlist;
import java.util.*;

public class MyQueueUseLinkedlist<E> {
    private int size = 0;
    private LinkedList<E> e;

    public MyQueueUseLinkedlist() {
        this.e = new LinkedList<>();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(E o) {
        e.addLast(o);
        size++;
    }

    public E dequeue() {
        E temp = e.getFirst();
        e.removeFirst();
        size--;
        return temp;
    }

    public E peek() {
        if (!isEmpty()) {
            return e.getFirst();
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
