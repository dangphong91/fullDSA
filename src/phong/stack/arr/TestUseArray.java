package phong.stack.arr;

public class TestUseArray {
    public static void main(String[] args) {
        MyStackUseArray<Integer> myStackUseArray = new MyStackUseArray<>();
        myStackUseArray.push(1);
        myStackUseArray.push(2);
        myStackUseArray.push(3);
        System.out.println(myStackUseArray);
        System.out.println(myStackUseArray.pop());
        System.out.println(myStackUseArray);
        System.out.println(myStackUseArray.pop());
        System.out.println(myStackUseArray.pop());
        System.out.println(myStackUseArray.pop());
        System.out.println(myStackUseArray);
    }
}

