package Linked_Lists;

public class Circular_Linked_List {

    public static Node head = null;
    public static Node tail = null;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
