package Linked_Lists;

import java.util.LinkedList;

public class Linked_List {
    Node head;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Linked_List Insert(Linked_List list, int d) {
        Node new_node = new Node(d);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;

        }
        return list;
    }
    public static Linked_List InsertAfter(Linked_List list,Node prev_node,int d){
        Node new_node=new Node(d);
        new_node.next=prev_node.next;
        prev_node.next=new_node;    
        return list;
    }
    public static void printList(Linked_List list) {
        Node curr_node = list.head;
        System.out.println("Linked List");
        while (curr_node != null) {
            if (curr_node.next != null) {
                System.out.print(curr_node.data + "->");
            } else
                System.out.print(curr_node.data);

            curr_node = curr_node.next;
        }
        System.out.println();


    }
    public static Linked_List deleteKey(Linked_List list, int key) {
        Node curr_node = list.head, prev = null;
        if (curr_node != null && curr_node.data == key) {
            list.head = curr_node.next;
            System.out.println(key + " Found and deleted.");
            return list;
        }
        while (curr_node!=null&&curr_node.data!=key){
            prev=curr_node;
            curr_node=curr_node.next;
        }
        if (curr_node!=null){
            prev.next=curr_node.next;
            System.out.println(key+" Found And Deleted");
        }
        if (curr_node==null){
            System.out.println(key+" Not Found");
        }
            return list;
    }
    public static Linked_List deleteAtPos(Linked_List list,int index){
        Node curr_node=list.head,prev=null;
            if (curr_node!=null&&index==0){
                list.head=curr_node.next;
                System.out.println("Found and Deleted");
                return list;
            }
            int counter=0;
            while (curr_node!=null){
                if (counter==index){
                    prev.next=curr_node.next;
                    System.out.println("Found and deleted");
                    break;
                }
                else {
                    prev=curr_node;
                    curr_node=curr_node.next;
                    counter++;
                }
            }

            if (curr_node==null){
                System.out.println("Not found");
            }
        return list;
    }


    public static Linked_List reverrseList(Linked_List list){
        Node curr_node=list.head,prev=null,next=null;
        if (curr_node==null){
            return null;
        }
        else {
            while (curr_node!=null){
            next=curr_node.next;
            curr_node.next=prev;
            prev=curr_node;
            curr_node=next;
            }
            list.head=prev;

        }

        return list;
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list = Insert(list, 1);
        list = Insert(list, 2);
        list = Insert(list, 5);
        list = Insert(list, 8);
        printList(list);
        printList(reverrseList(list));

    }
}
