package Collections_Framework;

import java.util.*;

public class Linked_List {
    public static void main(String[] args) {


//        implements list and deque extend
//        Not Synchronized Doubly Linked List Implementation
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Abhinav");
        linkedList.add("Ab");
        linkedList.add("jhds");
        System.out.println(linkedList);

//        Synchronized
        List<String> listOne=Collections.synchronizedList(new LinkedList<>());



    }

}
