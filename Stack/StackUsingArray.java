package Stack;

 class StackUsingArray{
        private int[] stack;
        private int top;
        private int capacity;

        StackUsingArray(int capacity){
            this.capacity = capacity;
            stack = new int[capacity];
            top = -1;
        }

        public void push(int value){
            if (top == capacity - 1){
                System.out.println("Stack Overflow");
                return;
            }
            stack[++top] = value;
        }

        public int pop(){
            if (top == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            return stack[top--];
        }
        public int peak(){
            if (top == -1){
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[top];
        }
        public boolean isEmpty(){
            return top == -1;
        }
    }


