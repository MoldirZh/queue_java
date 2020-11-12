package csci235;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> stk = new LinkedListQueue();

        //peek and pop to an empty linked list
        try {
            System.out.println("peek: " + stk.peek());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            stk.pop();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //size and empty on empty linked list
        System.out.println("size: " + stk.size());
        System.out.println("isEmpty: " + stk.empty());


        //push  1 element
        stk.push (10);
        System.out.println(stk);
        System.out.println("size: " + stk.size());
        System.out.println("isEmpty: " + stk.empty());
        //pop this element
        try {
            stk.pop();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(stk);


        //push many elements
        for (int i = 20; i < 200; i = i + 10) {
            stk.push(i);
        }
        System.out.println(stk);

        try {
            System.out.println("peek: " + stk.peek());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("size: " + stk.size());
        System.out.println("isEmpty: " + stk.empty());

        try {
            stk.pop();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println(stk);
        System.out.println("size: " + stk.size());
        System.out.println("isEmpty: " + stk.empty());


        System.out.println("Clear: ");
        stk.clear();
        System.out.println("size: " + stk.size());
        System.out.println("isEmpty: " + stk.empty());
        System.out.println(stk);
    }
}
