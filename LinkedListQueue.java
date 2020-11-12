package csci235;

/**
 * Generic stack implementation using a singly-Linked List
 *
 * @param <T>
 */

public class LinkedListQueue<T> implements Queue<T> {
    class Node<T> {
        private T value;
        private Node link;

        public Node(T val) {
            value = val;
        }

        public T getValue() {
            return value;
        }

        public void setLink(Node next) {
            link = next;
        }

        public Node getLink() {
            return link;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node(value);

        if (head == null) { //if the list is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.setLink(newNode);
            tail = newNode;
        }
        size++;
    }

    public T peek() throws Exception {
        if (size == 0) {
            throw new Exception("Cannot peek on empty stack");
        }
        return head.getValue();
    }

    public void pop() throws Exception {
        if (size == 0) {
            throw new Exception("Cannot pop on empty stack");
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.getLink();
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void clear() {
        head = null; //the remaining nods won't be referenced by anything else->free
        size = 0;
    }

    public String toString() {
        String result = "[";

        Node<T> curr = head;

        while (curr != null) {
            result += curr.getValue() + " ";
            curr = curr.getLink();
        }

        result += "]";
        return result;
    }
}
