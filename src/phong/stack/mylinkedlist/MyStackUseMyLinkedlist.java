package phong.stack.mylinkedlist;

import phong.linkedlist.MyLinkedList;

public class MyStackUseMyLinkedlist<E> {
    private MyLinkedList<E> e;
    private int size = 0;

    public MyStackUseMyLinkedlist() {
        this.e = new MyLinkedList<>();
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
