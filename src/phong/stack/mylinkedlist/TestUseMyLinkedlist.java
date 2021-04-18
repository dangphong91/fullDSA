package phong.stack.mylinkedlist;

public class TestUseMyLinkedlist {
    public static void main(String[] args) {
        MyStackUseMyLinkedlist<Integer> myStackUseLL = new MyStackUseMyLinkedlist<>();
        myStackUseLL.push(3);
        myStackUseLL.push(5);
        myStackUseLL.push(7);
        myStackUseLL.push(5);
        myStackUseLL.push(6);
        System.out.println(myStackUseLL);
        System.out.println(myStackUseLL.pop());
        System.out.println(myStackUseLL);
        System.out.println(myStackUseLL.pop());
        System.out.println(myStackUseLL);
        System.out.println(myStackUseLL.peek());
    }
}
