package LinkedList;

public class SinglyLikedList {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public void deleteFromBegining(){
    if (head == null){
        System.out.println("List is empty");
        return;
    }
    head = head.next;
}

    public void deleteByValue(int value){
    if (head == null){
        System.out.println("List is empty");
        return;
    }
    if (head.data == value){
        head = head.next;
        return;
    }
    Node temp = head;
    while (temp.next != null && temp.next.data != value){
        temp = temp.next;
    }
    if (temp.next == null){
        System.out.println("Value not found");
        return;
    }
    temp.next = temp.next.next;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next =  prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}

