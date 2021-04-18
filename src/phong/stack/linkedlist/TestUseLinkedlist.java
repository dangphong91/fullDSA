package phong.stack.linkedlist;

public class TestUseLinkedlist {
    public static void main(String[] args) {
        MyStackUseLinkedlist<Integer> myStackUseLL = new MyStackUseLinkedlist<>();
        myStackUseLL.push(3);
        myStackUseLL.push(5);
        myStackUseLL.push(7);
        myStackUseLL.push(5);
        myStackUseLL.push(6);
        System.out.println(myStackUseLL);
        System.out.println(myStackUseLL.pop());
        System.out.println(myStackUseLL);
        System.out.println(myStackUseLL.pop());
        System.out.println(myStackUseLL.pop());
        System.out.println(myStackUseLL.pop());
        System.out.println(myStackUseLL);
    }
}
