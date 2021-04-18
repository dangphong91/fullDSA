package phong.queue.arr;

public class TestUseArray1 {
    public static void main(String[] args) {
        MyQueueUseArray<Integer> myQueueUseArray = new MyQueueUseArray<>();
        myQueueUseArray.enqueue(5);
        myQueueUseArray.enqueue(6);
        myQueueUseArray.enqueue(7);
        myQueueUseArray.enqueue(8);
        System.out.println(myQueueUseArray);
        System.out.println(myQueueUseArray.dequeue());
        System.out.println(myQueueUseArray.dequeue());
        System.out.println(myQueueUseArray);
    }
}
