package phong.linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E item) {
        if (index == 0) addFirst(item);
        else if (index >= size) addLast(item);
        else {
            Node current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node temp = current.next;
            current.next = new Node(item);
            current.next.next = temp;
            size++;
        }
    }

    public void addLast(E item) {
        if (!isEmpty()) {
            tail.next = new Node(item);
            tail = tail.next;
        }
        else {
            tail = new Node(item);
            head = tail;
        }
        size++;
    }

    public void addFirst(E item) {
        if (!isEmpty()) {
            Node holder = head;
            head = new Node(item);
            head.next = holder;
        }
        else {
            tail = new Node(item);
            head = tail;
        }
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = holder.next;
            size--;
            return holder.data;
        }
    }

    public E removeLast() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = null;
            tail = temp;
            size--;
            return holder.data;
        }
        else {
            return null;
        }
    }

    public E removeFirst() {
        if (!isEmpty()) {
            Node holder = head;
            head = holder.next;
            size--;
            return holder.data;
        }
        else {
            return null;
        }
    }

    public E getFirst() {
        return head.data;
    }

    public E getLast() {
        return tail.data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String print = "";
        Node temp = head;
        while (temp.next != null) {
            print += temp.data + ",";
            temp = temp.next;
        }
        print += temp.data;
        return print;
    }
}
