package Stack;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peak() {
        if (top == null){
            System.out.println("Stack is emtpu");
            return -1;
        }
        return top.data;
    }

    public boolean isEmtpy(){
        return top == null;
    }
}
