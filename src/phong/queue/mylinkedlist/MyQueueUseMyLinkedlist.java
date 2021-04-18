package phong.queue.mylinkedlist;

import phong.linkedlist.MyLinkedList;

public class MyQueueUseMyLinkedlist<E> {
    private int size = 0;
    private MyLinkedList<E> e;

    public MyQueueUseMyLinkedlist() {
        this.e = new MyLinkedList<>();
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
