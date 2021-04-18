package phong.queue.mylinkedlist;


public class TestUseMyLinkedlist {
    public static void main(String[] args) {
        MyQueueUseMyLinkedlist<Integer> myQueueUseLinkedlist = new MyQueueUseMyLinkedlist<>();
        myQueueUseLinkedlist.enqueue(9);
        myQueueUseLinkedlist.enqueue(8);
        myQueueUseLinkedlist.enqueue(7);
        myQueueUseLinkedlist.enqueue(6);
        System.out.println(myQueueUseLinkedlist);
        System.out.println(myQueueUseLinkedlist.dequeue());
        System.out.println(myQueueUseLinkedlist);
    }

}
