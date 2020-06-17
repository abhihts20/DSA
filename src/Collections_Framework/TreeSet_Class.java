package Collections_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Class {
    public static void main(String[] args) {
//        implements the Set interface that uses a tree for storage
//        AbstractSet class and implements the NavigableSet interface.
//        Java TreeSet class doesn't allow null element.
//        Java TreeSet class is non synchronized.
//        Java TreeSet class maintains ascending order.
//        Ascending Order
        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Iterator i1 = al.descendingIterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: " + set.pollFirst()); //last elememt
        System.out.println("Lowest Value: " + set.pollLast());//first element

        TreeSet<String> setA = new TreeSet<>();
        setA.add("A");
        setA.add("B");
        setA.add("C");
        setA.add("D");
        setA.add("E");
        System.out.println(setA);
        System.out.println(setA.descendingSet());//reverse
        System.out.println(setA.headSet("C",true));
        System.out.println(setA.tailSet("D",false));
        System.out.println(setA.subSet("A",false,"E",false));
    }
}
