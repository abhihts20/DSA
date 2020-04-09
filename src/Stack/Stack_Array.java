package Stack;

public class Stack_Array {


    static final int MAX = 1000;
    int top = 0;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack_Array() {
        top = -1;
    }

    boolean push(int d) {

        if (top >= (MAX - 1)) {
            System.out.println("Overflow");
            return false;
        } else {
            a[++top] = d;
            return true;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }


    public static void main(String[] args) {
        Stack_Array st = new Stack_Array();
        st.push(4);
        st.push(7);
        st.push(1);

    }

}
