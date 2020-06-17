package Collections_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Class {
    public static void main(String[] args) {
//        It inherits the AbstractSet class and implements Set interface.
//        HashSet class is non synchronized.
//        The initial default capacity of HashSet is 16, and the load factor is 0.75.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        Iterator<String> i = hashSet.iterator();
        while (i.hasNext()) {
            System.out.println(
                    i.next()
            );
        }
    }
}
