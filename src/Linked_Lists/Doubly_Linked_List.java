package Linked_Lists;

import org.w3c.dom.Node;

public class Doubly_Linked_List {

    private static Node head;

    static class Node {
        Node prev;
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    //        Adding at the front
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    //Insert after a given node
    public void insertAfter(Node prev_node, int data) {
        if (prev_node == null) {
            System.out.println("Previous Given Node Cannot be Equal to Null");
        }
        Node newNode = new Node(data);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        newNode.prev = prev_node;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        Node last = head;
        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void printlist(Node node) {
        Node last = null;

        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }

        System.out.println();
    }

    public void deleteNode(Node head_ref,Node del){
            if (head == null || del==null){
                return;
            }
            if (head==del){
                head=del.next;
            }

            if (del.next!=null){
                del.prev.next=del.prev;
            }
            if (del.prev!=null){
                del.prev.next=del.next;
            }
            return;
    }

    public static void main(String[] args) {
        Doubly_Linked_List dll = new Doubly_Linked_List();
        dll.push(32);
        dll.push(123);
    }
}
