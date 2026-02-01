package queue;

public class QueueUsingArray {
    int[] queue;
    int front, rear, size;

    QueueUsingArray(int size){
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }
    void enqueue(int x){
        if (rear == size - 1){
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = x;
    }
    
    int dequeue() {
        if (isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }
    int peak() {
        if (isEmpty()) return -1;
        return queue[front];
    }
    boolean isEmpty(){
        return front > rear;
    }
    
}
