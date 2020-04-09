package Stack;

public class Stack_LinkedList {
    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;

        } else {
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
    }

    public int pop() {

        if (isEmpty()) {
            return 0;
        } else {
            int popped = top.data;
            top = top.next;
            return popped;
        }

    }

    public int peek(){
        if (isEmpty()) {
            return 0;
        } else {
           return top.data;
        }
    }

    public static void main(String[] args) {
        Stack_Array stack_array=new Stack_Array();
        stack_array.push(7);
        stack_array.push(2);

    }
}
