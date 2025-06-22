package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // Size
        System.out.println("Size of the set: " + set.size());

        // Search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set does not has 1. 1 is deleted");
        }

        // Print all elements
        System.out.println(set);

        //Iteration - HashSet does not have an order
        set.add(0);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        // isEmpty
        if(!set.isEmpty()){
            System.out.println("Set is not empty");
        }
    }
}
