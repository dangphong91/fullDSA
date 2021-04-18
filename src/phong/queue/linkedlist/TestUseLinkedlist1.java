package phong.queue.linkedlist;

public class TestUseLinkedlist1 {
    public static void main(String[] args) {
        MyQueueUseLinkedlist<Integer> myQueueUseLinkedlist = new MyQueueUseLinkedlist<>();
        myQueueUseLinkedlist.enqueue(9);
        myQueueUseLinkedlist.enqueue(8);
        myQueueUseLinkedlist.enqueue(7);
        myQueueUseLinkedlist.enqueue(6);
        System.out.println(myQueueUseLinkedlist);
        System.out.println(myQueueUseLinkedlist.dequeue());
        System.out.println(myQueueUseLinkedlist);
    }

}
